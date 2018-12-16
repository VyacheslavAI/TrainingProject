package com.max;

import com.max.beans.User;
import org.springframework.web.client.RestTemplate;

public class RestMain {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://localhost:8080/restGet2", User.class);
        System.out.println(user.getName());
    }
}
