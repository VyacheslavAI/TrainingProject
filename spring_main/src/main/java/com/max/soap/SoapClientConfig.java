package com.max.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class SoapClientConfig {

//    @Bean
//    public JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean() throws MalformedURLException {
//        JaxWsPortProxyFactoryBean bean = new JaxWsPortProxyFactoryBean();
//        bean.setWsdlDocumentUrl(new URL("http://localhost:8888/SoapService?wsdl"));
//        bean.setServiceName("SoapService");
//        bean.setServiceInterface(SoapService.class);
//        bean.setPortName("SoapServiceEndpointPort");
//        bean.setNamespaceUri("http://soap.max.com/");
//        return bean;
//    }
}
