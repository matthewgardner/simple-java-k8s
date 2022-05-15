package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @GetMapping("/greetings")
    String simpleMessage() {
        return "Hellow Geek Weekly";
    }

}