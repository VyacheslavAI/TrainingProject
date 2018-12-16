package com.max;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionInterceptorClass {

    @ExceptionHandler(value = ExceptionController.MyNewException.class)
    @ResponseBody
    public String catchException() {
        return "exception was been catch by eic";
    }
}
