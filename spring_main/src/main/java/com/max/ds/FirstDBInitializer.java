package com.max.ds;

import com.max.config.MyConfig;
import com.max.config.MyWebJpaConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class FirstDBInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class, MyWebJpaConfig.class};
    }

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    public void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("C:\\Users\\DNS\\Desktop\\Testing"));
    }
}
