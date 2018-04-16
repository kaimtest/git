package com.example.git;

import org.springframework.web.bind.annotation.RequestMapping;

//коммит на сервере
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String myTabl() {
        return "tabl";
    }
    @RequestMapping("/form")
    public String myform() {
        return "form";
    }
}
