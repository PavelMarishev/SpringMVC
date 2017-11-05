package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WelcomeController {

    @RequestMapping("/myPage")
    public String hello(Model model) {
         String w = "Welcome to TI courses";
        model.addAttribute("welcome", w);
        return "welcome";
    }

}
