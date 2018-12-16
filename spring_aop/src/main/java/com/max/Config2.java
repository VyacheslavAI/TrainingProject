package com.max;

import com.max.impl.BestFm;
import com.max.impl.MyCondition;
import com.max.impl.WorstFm;
import com.max.interfaces.Radio;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class Config2 {

//    @Bean
//    @Profile("default")
//    @Primary
//    @Qualifier("radio")
//    public Radio getRadio() {
//        return new BestFm();
//    }

//    @Bean
//    @Profile("dev")
//    @Conditional(MyCondition.class)
//    @Primary
//    @Qualifier("radio")
//    @MyRadio
     public Radio getWorstRadio() {
        return new WorstFm();
    }
}
