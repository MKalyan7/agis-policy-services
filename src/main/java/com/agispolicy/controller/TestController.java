package com.agispolicy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/agis-policy/api/hello")
    public String sayHello() {
        return "Welcome to the Agis Policy";
    }
}
