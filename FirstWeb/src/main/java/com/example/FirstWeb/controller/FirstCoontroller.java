package com.example.FirstWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstCoontroller   {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("username","MR.LEE");
        return "greetings";
    }

    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("username","MR.LEE");
        return "bye";
    }
}

