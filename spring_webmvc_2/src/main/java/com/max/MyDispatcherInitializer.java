package com.max;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyDispatcherInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyConfig.class);
        context.refresh();

//        XmlWebApplicationContext context = new XmlWebApplicationContext();
//        context.setConfigLocation("WEB-INF/DispServlet-servlet2.xml");

        ServletRegistration.Dynamic registration = container.addServlet("dispInit", new DispatcherServlet(context));
        registration.setLoadOnStartup(1);
        registration.addMapping("/dispInit/*");
    }
}
