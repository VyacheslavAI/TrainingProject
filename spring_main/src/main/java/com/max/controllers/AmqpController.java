package com.max.controllers;

import org.springframework.amqp.rabbit.core.RabbitOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpController {

    @Autowired
    RabbitOperations rabbitOperations;

    @GetMapping("sendAmqpMessage")
    public String send() {
        rabbitOperations.convertAndSend("qu", "hello from rabbit test");
        return "message has been sent";
    }

    @GetMapping("readAmqpMessage")
    public String read() {
        return rabbitOperations.receiveAndConvert("qu").toString();
    }

}
