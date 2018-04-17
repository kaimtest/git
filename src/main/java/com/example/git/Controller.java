package com.example.git;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Repositories repositories;

    @RequestMapping("/")
    public String myTabl(Model model) {
        model.addAttribute("message",repositories.findAll());
        return "index";
    }
}
