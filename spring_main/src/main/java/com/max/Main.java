package com.max;

import com.max.beans.User;
import com.max.config.DbConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);


//        SoapService soapService = context.getBean(SoapService.class);
//
//        soapService.printMessage("hello from soap client");

////        Repository bean = context.getBean(UserRepository.class);
////        bean.createTable();
//
//        StudentRepo studentRepo = context.getBean(StudentRepo.class);
//        studentRepo.saveStudent(new Student("PlusMax"));
//        studentRepo.saveStudent(new Student("NewMax"));
//        studentRepo.saveStudent(new Student("MinusMax"));
//        StudentAutoRepository repository = context.getBean(StudentAutoRepository.class);
//        Student student = repository.getByName("MinusMax");
//        repository.saveStudent(new Student("WOW"));
//        System.out.println(student.getId());
    }
}
