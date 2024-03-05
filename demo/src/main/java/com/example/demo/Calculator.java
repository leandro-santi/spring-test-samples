package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping("/add")
    private String addition(@RequestParam(name = "a", defaultValue = "0")
                            double a, @RequestParam(name = "b", defaultValue = "0") double b) {
        var result = a + b;
        return "Sum: " + result;
    }

    @GetMapping("/subtract")
    private String subtraction(@RequestParam(name = "a", defaultValue = "0")
                               double a, @RequestParam(name = "b", defaultValue = "0") double b) {
        var result = a - b;
        return "Subtraction: " + (a - b);
    }

    @GetMapping("/multiply")
    private String multiplication(@RequestParam(name = "a", defaultValue = "0")
                                  double a, @RequestParam(name = "b", defaultValue = "0") double b) {
        var result = a * b;
        return "Multiplication: " + (a * b);
    }

    @GetMapping("/divide")
    private String division(@RequestParam(name = "a", defaultValue = "0")
                            double a, @RequestParam(name = "b", defaultValue = "0") double b) {
        try {
            var result = a / b;
            return "Division: " + (a / b);
        } catch (ArithmeticException e) {
            return "Invalid Operation";
        } finally {
            System.out.println("Tried!");
        }
    }

}