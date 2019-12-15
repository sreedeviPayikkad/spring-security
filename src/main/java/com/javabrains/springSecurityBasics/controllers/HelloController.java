package com.javabrains.springSecurityBasics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayhello() {
        return "Hello all users";
    }

    @GetMapping("/user")
    public String helloNormalUser() {
        return "Hello user";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello admin";
    }

}
