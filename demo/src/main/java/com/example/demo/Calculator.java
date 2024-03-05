package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping("/sum")
    private String Sum(@RequestParam(name = "a", defaultValue = "0")
                       int a, @RequestParam(name = "b", defaultValue = "0") int b) {
        int result = a + b;
        return "Sum: " + result;
    }

    @GetMapping("/sub")
    private String Sub(@RequestParam(name = "a", defaultValue = "0")
                       int a, @RequestParam(name = "b", defaultValue = "0") int b) {
        int result = a - b;
        return "Subtraction: " + (a - b);
    }

    @GetMapping("/multi")
    private String Multiplication(@RequestParam(name = "a", defaultValue = "0")
                                  int a, @RequestParam(name = "b", defaultValue = "0") int b) {
        int result = a * b;
        return "Subtraction: " + (a * b);
    }

    @GetMapping("/div")
    private String Division(@RequestParam(name = "a", defaultValue = "0")
                            int a, @RequestParam(name = "b", defaultValue = "0") int b) {

        try {
            int result = a / b;
            return "Subtraction: " + (a / b);
        } catch (ArithmeticException e) {
            return "Invalid Operation";
        } finally {
            System.out.println("Tried!");
        }
    }

}