package com.max;

import com.max.impl.BestFm;
import com.max.impl.Ferrary;
import com.max.impl.Toyota;
import com.max.impl.WorstFm;
import com.max.interfaces.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.max.Conf.class);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        context.register(Conf.class);
//        context.refresh();

//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\DNS\\IdeaProjects\\springTest\\src\\main\\resources\\config.xml");
//        ApplicationContext context = new XmlWebApplicationContext();
//        ApplicationContext context = AnnotationConfigWebApplicationContext();


//        ExpressionParser parser = new SpelExpressionParser();
//        Expression expression = parser.parseExpression("'Hello World'");
//        String message = (String) expression.getValue();
//        System.out.println(message);


//        BestFm bestFm = new BestFm();
//        bestFm.setName("NAME");
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression expression = parser.parseExpression("name");
//        EvaluationContext context1 = new StandardEvaluationContext(bestFm);
//        String message = (String) expression.getValue(context1);
//        System.out.println(message);


//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        context.load("classpath*:config.xml");
//        context.refresh();

        Toyota bean = context.getBean(Toyota.class);
        bean.drive();
    }
}