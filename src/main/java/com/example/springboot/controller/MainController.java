package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class MainController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello Springboot!";
    }
}
