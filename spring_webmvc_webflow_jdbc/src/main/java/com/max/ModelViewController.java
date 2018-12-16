package com.max;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelViewController {

    @RequestMapping("modelandview")
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView("modelandview");
        modelAndView.addObject("helloName", "my name is Slava");
        return modelAndView;
    }
}
