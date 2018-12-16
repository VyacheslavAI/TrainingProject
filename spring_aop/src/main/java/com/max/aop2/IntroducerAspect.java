package com.max.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IntroducerAspect {

    @DeclareParents(value = "com.max.aop2.MyRepo+", defaultImpl = AdditionalJob.class)
    public static NewInterface newInterface;
}
