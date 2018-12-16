package com.max.impl;

import com.max.interfaces.Car;
import com.max.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ferrary implements Car {

    @Autowired
    Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }

    public void drive() {
        radio.listenMusic();
        System.out.println("driving");
    }
}
