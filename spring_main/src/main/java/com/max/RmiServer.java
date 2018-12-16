package com.max;

import com.max.config.RmiServerConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RmiServer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RmiServerConfig.class);
    }
}
