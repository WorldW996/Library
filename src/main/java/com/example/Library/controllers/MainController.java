package com.example.Library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/") // указывает какой url адрес обрабатывается
    public String home(Model model) {
        model.addAttribute("title");
        return "home";
    }

}
