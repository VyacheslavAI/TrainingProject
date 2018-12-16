package com.max.controllers;


import com.max.beans.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecondRestController {

    @GetMapping("restGet2")
    public User get() {
        return new User("Max");
    }

    @PutMapping("restPut2")
    public User user(@RequestBody User user) {
        user.setName("Slava");
        return user;
    }

    @GetMapping("responseEntity")
    public ResponseEntity<User> responseEntity() {
        return new ResponseEntity<User>(new User("Mike"), HttpStatus.NOT_FOUND);
    }
}
