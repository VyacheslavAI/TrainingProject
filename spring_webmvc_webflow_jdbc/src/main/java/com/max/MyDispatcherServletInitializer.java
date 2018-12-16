package com.max;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyDispatcherServletInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {

//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(MyConfig.class);
//        context.refresh();

        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("/WEB-INF/megads.xml");

        ServletRegistration.Dynamic registration = container.addServlet("ds", new DispatcherServlet(context));
        registration.setLoadOnStartup(1);
        registration.addMapping("/ds/*");
//        registration.setMultipartConfig(new MultipartConfigElement("/some/directory/"));
    }
}
