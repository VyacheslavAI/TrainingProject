package com.max;

import com.max.config.RmiClientConfig;
import com.max.interfaces.RmiService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RmiClient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RmiClientConfig.class);
        RmiService service = context.getBean(RmiService.class);
        service.printMessage("hello, remote client");
    }

}
