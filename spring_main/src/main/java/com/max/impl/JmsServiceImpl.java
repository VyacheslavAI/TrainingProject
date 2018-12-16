package com.max.impl;

import com.max.beans.User;
import com.max.interfaces.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.JmsUtils;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

@Component
public class JmsServiceImpl {//implements JmsService {

//    @Autowired
//    JmsOperations jmsOperations;

//    @Override
    public void sendMessage(User user) {
//        jmsOperations.send("queueName", new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                return session.createObjectMessage(user);
//            }
//        });

//        jmsOperations.convertAndSend(user);
    }

//    @Override
//    public User receiveMessage() {
//        try {
//            ObjectMessage message = (ObjectMessage) jmsOperations.receive();
//            return (User) message.getObject();
//        } catch (JMSException e) {
//            throw JmsUtils.convertJmsAccessException(e);
//        }

//     return (User) jmsOperations.receiveAndConvert();
//    }

//    @JmsListener(destination = "queueName", containerFactory = "myFactory")
//    public void listen(User user) {
//        System.out.println(user.getName());
//    }
}
