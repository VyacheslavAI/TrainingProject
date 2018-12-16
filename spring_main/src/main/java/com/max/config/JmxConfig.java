package com.max.config;

import com.max.beans.MyMBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("com.max")
public class JmxConfig {

    @Bean
    public MBeanExporter exporter(MyMBean myMBean) {
        MBeanExporter exporter = new MBeanExporter();
        Map<String, Object> beans = new HashMap<>();
        beans.put("myMBean:name=Hello", myMBean);
        exporter.setBeans(beans);
        return exporter;
    }
}
