package com.example.FirstWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstCoontroller   {
    @GetMapping("/hello")
    public String print(){
        return "greetings";
    }
}
