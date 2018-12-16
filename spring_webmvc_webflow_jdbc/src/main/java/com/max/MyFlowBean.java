package com.max;

import com.max.repo.User;
import org.springframework.stereotype.Component;

@Component
public class MyFlowBean {

    public void printHello() {
        System.out.println("hello from flow bean");
    }

    public boolean trueOrFalse() {
        return true;
    }

    public void printUser(User user) {
        System.out.println(user.getName());
    }

    public void printI(int i) {
        System.out.println(i);
    }
}
