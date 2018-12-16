package com.max.controllers;

import com.max.interfaces.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    Repo repo;

    @GetMapping("test")
    public String test() {
        repo.createTable();
        return "test";
    }
}
