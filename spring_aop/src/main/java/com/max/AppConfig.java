package com.max;

import com.max.impl.BestFm;
import com.max.impl.Ferrary;
import com.max.impl.Toyota;
import com.max.interfaces.Car;
import com.max.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {

    @Bean
    public Car getCar1() {
        Toyota toyota = new Toyota();
        toyota.setRadio(bestFm());
        return toyota;
    }

    @Bean
    public Car getCar2() {
        Ferrary car = new Ferrary();
        car.setRadio(bestFm());
        return car;
    }

    @Bean
    public Radio bestFm() {
        return new BestFm();
    }
}
