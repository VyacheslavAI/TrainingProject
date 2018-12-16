package com.max.controllers;

import com.max.beans.Student;
import com.max.interfaces.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebJpaController {

//    @Autowired
//    StudentRepo repository;
//
//    @GetMapping("save")
//    @Transactional
//    @ResponseBody
//    public void saveStudent() {
//        repository.saveStudent(new Student("WebStudent"));
//    }
}
