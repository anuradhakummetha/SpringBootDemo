package com.itworks.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ITWorksController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Welcome to ITWorks !!!";
    }

}
