package com.example.studentclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/wishMsg")
    public String getWishMsg(){
        return "Welcome to The Student Controller";
    }

}
