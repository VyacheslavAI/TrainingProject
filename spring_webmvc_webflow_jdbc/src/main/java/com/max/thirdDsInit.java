package com.max;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class thirdDsInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected String[] getServletMappings() {
        return new String[]{"/third/*"};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{newConfig.class};
    }

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{newConfig.class};
    }

    @Override
    public void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("C:\\Users\\DNS\\Desktop\\Testing"));
    }
}
