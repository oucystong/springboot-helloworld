package com.example.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String helloTest() {
        return "hello,world...springboot";
    }
}









