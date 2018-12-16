package com.max.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;

import javax.jms.ConnectionFactory;

@Configuration
//@EnableJms
public class JmsConfig {

//    @Bean
//    public ActiveMQConnectionFactory activeMQConnectionFactory() {
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
////        factory.setBrokerURL("tcp://localhost:61616");
//        return factory;
//    }
//
//    @Bean
//    public ActiveMQQueue activeMQQueue() {
//        ActiveMQQueue queue = new ActiveMQQueue();
//        queue.setPhysicalName("queueName");
//        return queue;
//    }
//
//    @Bean
//    public ActiveMQTopic activeMQTopic() {
//        ActiveMQTopic activeMQTopic = new ActiveMQTopic();
//        activeMQTopic.setPhysicalName("topicName");
//        return activeMQTopic;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplate(ActiveMQConnectionFactory factory) {
//        JmsTemplate jmsTemplate = new JmsTemplate();
//        jmsTemplate.setConnectionFactory(factory);
//        jmsTemplate.setDefaultDestinationName("queueName");
//        return jmsTemplate;
//    }
//
//    @Bean
//    public MessageConverter messageConverter() {
//        return new MappingJackson2MessageConverter();
//    }
//
//    @Bean("myFactory")
//    public JmsListenerContainerFactory containerFactory(ConnectionFactory connectionFactory) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory);
//        return factory;
//    }
}
