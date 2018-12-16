package com.max.impl;

import com.max.interfaces.Radio;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class WorstFm implements Radio {

    public void listenMusic() {
        System.out.println("worst music");
    }
}
