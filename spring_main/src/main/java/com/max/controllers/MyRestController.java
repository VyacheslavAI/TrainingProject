package com.max.controllers;

import com.max.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyRestController {

    @GetMapping("restGet")
    @ResponseBody
    public User get() {
        return new User("Max");
    }

    @PutMapping("restPut")
    @ResponseBody
    public User user(@RequestBody User user) {
        user.setName("Slava");
        return user;
    }
}
