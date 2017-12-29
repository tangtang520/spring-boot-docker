package com.tfy.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class Home {

    @GetMapping("/home")
    public String home() {
        return "hello spring boot";
    }
}
