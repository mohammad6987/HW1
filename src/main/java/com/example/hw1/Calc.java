package com.example.hw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc {
    @GetMapping("{operation}/{num1}/{num2}")
    public float sum(@PathVariable float num1 , @PathVariable float num2 , @PathVariable String operation){

        return switch (operation) {
            case "sum" -> num1 + num2;

            case "mult" -> num1 * num2;

            case "subtract" -> num1 - num2;

            case "div" ->  num1 / num2;

            default -> -1;
        };

    }
}
