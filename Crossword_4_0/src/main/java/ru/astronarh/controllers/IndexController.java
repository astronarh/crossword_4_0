package ru.astronarh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String IndexController(Model model) {
        model.addAttribute("someAttribute", "someValue");
        return "index";
    }
}
