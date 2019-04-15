package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
    @RequestMapping("/user")
    public String index(){
        return "Hello World";
    }

}
