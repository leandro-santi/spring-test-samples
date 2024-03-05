package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    private String HelloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ("Hello " + name + "!");
    }

}