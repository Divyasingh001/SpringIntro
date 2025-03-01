package com.example.SpringIntro.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping(value = {"","/","/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
