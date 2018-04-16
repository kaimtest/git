package com.example.git;

import org.springframework.web.bind.annotation.RequestMapping;

//коммит на сервере
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String myTabl() {
        return "tabl";
    }
    @RequestMapping("/forma")
    public String myform() {
        return "form";
    }
    @RequestMapping("/in")
    public String index() {
        return "index";
    }

}
