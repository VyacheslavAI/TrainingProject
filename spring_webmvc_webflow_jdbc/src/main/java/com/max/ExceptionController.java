package com.max;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController {

    @GetMapping("myException")
    public void myException() {
        throw new MyNewException();
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "this is my exception")
    class MyNewException extends RuntimeException {

    }
}

