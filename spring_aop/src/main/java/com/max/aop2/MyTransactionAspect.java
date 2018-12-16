package com.max.aop2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyTransactionAspect {


    @Pointcut("execution(* com.max.aop2.MyUserRepo.getInfo())")
    public void myPointCut(){}

    @Pointcut("execution(* com.max.aop2.MyUserRepo.withParam(String)) && args(name)")
    public void pointcutWithParam(String name){}

    @Before(value = "pointcutWithParam(name)")
    public void beforeMethodWithParam(String name) {
        System.out.println("hello, what's your name");
    }


    @Before("myPointCut()")
//    @Before("execution(* com.max.aop2.MyUserRepo.getInfo())")
    public void beforeTransaction() {
        System.out.println("before transaction");
    }

    @After("myPointCut()")
//    @After("execution(* com.max.aop2.MyUserRepo.getInfo())")
    public void after() {
        System.out.println("after method");
    }

    @AfterReturning("myPointCut()")
//    @AfterReturning("execution(* com.max.aop2.MyUserRepo.getInfo())")
    public void commitTransaction() {
        System.out.println("commit transaction");
    }

    @AfterThrowing("myPointCut()")
//    @AfterThrowing("execution(* com.max.aop2.MyUserRepo.getInfo())")
    public void rollback() {
        System.out.println("rollback");
    }
}
