package com.learnSpringSecurityJVL.LearnSpringSecurityJVL.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping
    public String getHomePage(){
        return "Home page";
    }
    @GetMapping("/dashboard")
    public String getDashPage(){
        return "Dashboard";
    }
}
