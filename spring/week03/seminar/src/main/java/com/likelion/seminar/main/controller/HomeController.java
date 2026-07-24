package com.likelion.seminar.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model page){
        page.addAttribute("username", "babylion");
        page.addAttribute("color","red");
        return "home";
    }
}
