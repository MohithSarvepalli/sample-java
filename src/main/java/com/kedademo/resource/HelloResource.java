package com.kedademo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {
    @GetMapping
    public String hello(){
        return "Hello!!,Welcome to Keda-Demo!!!";
    }
}
