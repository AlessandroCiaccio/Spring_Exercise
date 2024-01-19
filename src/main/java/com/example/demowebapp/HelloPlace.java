package com.example.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloPlace {
    @GetMapping(path= "/helloPlace")
    public String helloPlace(@RequestParam String name, @RequestParam String place){
        return "Hello "+name+", how is the weather in "+ place +"?";

    }

}
