package com.max.controllers;

import com.max.beans.User;
import com.max.interfaces.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class JmsController {

//    @Autowired
//    JmsService jmsService;

//    @GetMapping("sendMessage")
//    public String sendMessage() {
//        jmsService.sendMessage(new User("Slava"));
//        return "message has been sent";
//    }
//
//    @GetMapping("receiveMessage")
//    public String receiveMessage() {
//        User user = jmsService.receiveMessage();
//        return user.getName();
//    }
}
