package com.example.uniprojektbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("noAuth/account")
public class NoAuthController {

    @GetMapping
    public String noAuth(){
        return "no auth";
    }
}
