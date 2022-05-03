package com.careerdevs.Springboot.Demo.Example.With.Margie.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    private String helloCareerDevs(){
        return "You requested the root route";
    }

}
