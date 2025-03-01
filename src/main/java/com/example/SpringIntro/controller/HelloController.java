package com.example.SpringIntro.controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
   //used request  mapping to get the query in the form of name and display it
    @RequestMapping(value="/query")
    public String queryController(@RequestParam(value="name") String name){
        return "Hello "+name+" !";
    }

    //used params to take input and display it
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name +"! ";
    }
}
