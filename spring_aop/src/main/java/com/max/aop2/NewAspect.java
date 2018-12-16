package com.max.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewAspect {


    @Before("execution (* com.max.aop2.MyUserRepo.getInfo())")
    public void before() {
        System.out.println("new before");
    }
}
