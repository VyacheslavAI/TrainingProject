package com.max;

import com.max.repo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class FormController {

    @RequestMapping("myForm")
    public String getForm() {
        return "myForm";
    }

    @PostMapping("myForm")
    public String getData(User user, RedirectAttributes model) {
//        return user.getName() + " " + user.getAge();
        model.addFlashAttribute(user);
        return "redirect:/first/redirTo";
//        return "forward:/first/redirTo";
    }
}
