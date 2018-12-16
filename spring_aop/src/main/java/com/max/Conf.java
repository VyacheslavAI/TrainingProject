package com.max;

import com.max.impl.Toyota;
import com.max.interfaces.Car;
import com.max.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.ArrayList;

@Configuration
@ComponentScan
@Import(Config2.class)
//@ImportResource("classpath:config2.xml")
@PropertySource("classpath:my.properties")
public class Conf {

    @Autowired
    Environment environment;

//    @Bean
//    public Car getToyota(Radio radio) {
//        return new Toyota();
//    }
}
