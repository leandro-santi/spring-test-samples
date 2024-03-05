package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello") // /hello?name=Leandro
    private String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ("Hello " + name + "!");
    }

}