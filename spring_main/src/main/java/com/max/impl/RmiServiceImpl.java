package com.max.impl;

import com.max.interfaces.RmiService;


public class RmiServiceImpl implements RmiService {

    public void printMessage(String message) {
        System.out.println(message);
    }
}
