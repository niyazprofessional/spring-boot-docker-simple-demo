package com.niyaz.springbootdockersimpledemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "HELLO WORLD";
    }
}
