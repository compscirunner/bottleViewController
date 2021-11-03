package com.example.bottletracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bottleController {
    
    @RequestMapping("/")
    public String mainView(Model model){
        return "main";
    }
}
