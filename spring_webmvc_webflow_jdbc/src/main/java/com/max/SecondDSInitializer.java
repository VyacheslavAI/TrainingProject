package com.max;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class SecondDSInitializer {//extends AbstractDispatcherServletInitializer {

    public WebApplicationContext createServletApplicationContext() {
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("WEB-INF/megads.xml");

        return context;
    }

    public String[] getServletMappings() {
        return new String[]{"/second/*"};
    }

    public WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
