package com.TestDevOps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/home")
    public String testMethod(){
        return "This  is Test DvOps running";
    }
}
