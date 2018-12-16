package com.max.impl;

import com.max.interfaces.MyComponent;
import org.springframework.stereotype.Component;

@Component
public class MyComponentImpl implements MyComponent {

    public void print() {
        System.out.println("hello boot");
    }
}
