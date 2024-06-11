package org.example.springbootsecuritypart1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class LoginController {

    @GetMapping("/getMsg")
    public String greeting(){
        return "Spring Security Example";
    }
}
