package com.max.impl;

import com.max.interfaces.Car;
import com.max.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
//@Resource
//@Service
//@Repository
//@Controller
//@Named
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@PropertySource("classpath:my.properties")
public class Toyota implements Car {

    @Autowired
    Radio radio;

    @Value("{'one', 'two', 'three'}")
    List<String> list;// = Arrays.asList("one", "two", "three");


//    @Value("#{1}")
//    @Value("#{radio.name}")
//    @Value("#{radio.getName()}")
//    @Value("#{radio.getName().toUpperCase()}")
//    @Value("#{radio.getName()?.toUpperCase()}")
//    @Value("#{systemProperties['java.home']}")
//    @Value("#{3.23423}")
//    @Value("#{'Hello'}")
//    @Value("#{'Hello World'.concat('!')}")
//    @Value("#{'Hello World'.bytes.length}")
//    @Value("#{true}")
//    @Value("#{T(java.lang.Math).PI}")
//    @Value("#{1 + 2}")
//    @Value("#{1 < 2}")
//    @Value("#{true and false or true}")
//    @Value("#{1 eq 2}")
//    @Value("#{1 == 2}")
//    @Value("#{radio.name eq 'best'}")
//    @Value("#{radio.name == 'best'}")
//    @Value("#{radio.name == 'best' ? 'this is true' : 'this is false'}")
//    @Value("#{radio.name matches '[a-z]*'}")
//    @Value("#{radio.name matches '[0-9]*'}")
    @Value("#{toyota.list[0]}")
//    @Value("#{'This is a test'[0]}")
//    @Value("#{radio.name}")
//    @Value("#{radio.toString()}")
    String name;


    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving by " + name);
    }
}
