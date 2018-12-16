package com.max.aop2;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component("myUserRepo")
public class MyUserRepo implements MyRepo {

    public void getInfo() {
        System.out.println("name Max age 55");
    }

    public void withParam(String name) {
        System.out.println("my name is " + name);
    }
}
