package com.vijaygenius123.randomuser.msrugateway.controller;

import com.vijaygenius123.randomuser.msrugateway.dto.RandomUserResponseV1;
import com.vijaygenius123.randomuser.msrugateway.service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomUserControllerV1 {

    @Autowired
    RandomUserService randomUserService;

    @GetMapping("/api")
    RandomUserResponseV1 getUser(){
        return randomUserService.getUser();
    }

    @GetMapping("/hello")
    String helloUser(){
        return "Hello World";
    }
}
