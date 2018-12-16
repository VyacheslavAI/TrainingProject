package com.max.config;

import com.max.impl.RmiServiceImpl;
import com.max.interfaces.RmiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

//@Configuration
public class RmiServerConfig {

//    @Bean
//    public RmiService rmiService() {
//        return new RmiServiceImpl();
//    }
//
//    @Bean
//    public RmiServiceExporter rmiServiceExporter(RmiService rmiService) {
//        RmiServiceExporter exporter = new RmiServiceExporter();
//        exporter.setService(rmiService);
//        exporter.setServiceName("rmiServiceName");
//        exporter.setServiceInterface(RmiService.class);
////        exporter.setRegistryHost("localhost");
////        exporter.setRegistryPort(8080);
//
//        return exporter;
//    }
}
