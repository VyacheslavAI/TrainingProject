package com.max;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class FirstDispInitializer {//extends AbstractDispatcherServletInitializer {

    protected WebApplicationContext createServletApplicationContext() {
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("/WEB-INF/DispServlet-servlet2.xml");
        return context;
    }

    protected String[] getServletMappings() {
        return new String[]{"/first/*"};
    }

    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
