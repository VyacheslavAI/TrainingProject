package com.max.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @GetMapping("myBootApp")
    public String test() {
        return "hello boot application";
    }
}
