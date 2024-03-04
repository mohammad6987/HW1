package com.example.hw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cal {
    @GetMapping("cal/[num1]/[num2]")
    public void sum(){

    }
}
