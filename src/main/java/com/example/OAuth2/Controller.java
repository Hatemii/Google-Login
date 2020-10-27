package com.example.OAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello() {
        return "Hello Hello";
    }

    @GetMapping("/restricted")
    public String tryThis() {
        return "This file cannot open you must loggin first";
    }
}
