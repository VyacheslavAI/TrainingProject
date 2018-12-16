package com.max;

import com.max.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = {"home"})
public class MyController {

    @Autowired
    UserRepo repository;

//    @RequestMapping(value = {"home"})
    @GetMapping(path = "one")
    @ResponseBody
    public String home1() {
        return "home1";
    }

    @PostMapping
    public String home2() {
        return "home2";
    }
}
