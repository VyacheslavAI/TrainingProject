package com.max;

import com.max.repo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedirectController {

    @GetMapping("redir")
    public String redirect() {
//        return "redirect:/first/redirTo";
        return "forward:/first/redirTo";
    }

    @RequestMapping("redirTo")
    @ResponseBody
    public String redirectMe(Model model) {
        User user = (User) model.asMap().get("user");
        return "hello " + user.getName();
    }

}
