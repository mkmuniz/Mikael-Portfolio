package com.io.github.com.mkmuniz.portfolio.projects.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test() {
        return "API está funcionando!";
    }
} 