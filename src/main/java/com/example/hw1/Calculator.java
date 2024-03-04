package com.example.hw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("{operation}/{num1}/{num2}")
    public float sum(@PathVariable int num1 , @PathVariable int num2 , @PathVariable String operation){

        return switch (operation) {
            case "sum" -> num1 + num2;

            case "mul" -> num1 * num2;

            case "sub" -> num1 - num2;

            case "div" -> (float) num1 / num2;

            default -> -1;
        };

    }
}
