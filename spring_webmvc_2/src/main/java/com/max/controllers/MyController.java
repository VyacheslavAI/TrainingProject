package com.max.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value = {"/", "/hello"})
    @ResponseBody
    public String doGet() {
        return "hello world from dispatcher servlet";
    }
}
