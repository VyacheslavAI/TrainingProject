package com.max.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyTransactionAround {

    @Around("execution(* com.max.aop2.MyUserRepo.getInfo())")
    public void aroundTransaction(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("begin transaction");
            System.out.println("after");
            joinPoint.proceed();
            System.out.println("commit transaction");
        } catch (Throwable throwable) {
            System.out.println("rollback");
        }
    }
}
