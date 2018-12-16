package com.max.test.controllers;

import com.max.beans.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("test")
    public String test() {
        return "test!!!";
    }

    @PostMapping("testJson")
    public User user() {
        return new User("Slava");
    }

    @PutMapping("testParams")
    public String testParams(@RequestParam int id) {
        return String.valueOf(id);
    }
}
