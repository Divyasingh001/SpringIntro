package com.example.SpringIntro.controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @RequestMapping(value="/query")
    public String queryController(@RequestParam(value="name") String name){
        return "Hello "+name+" !";
    }
}
