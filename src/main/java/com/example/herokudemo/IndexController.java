package com.example.herokudemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8080/index
@CrossOrigin(origins = "*", allowedHeaders = "*") // "http://localhost:8080")
@Controller
public class IndexController {

    @RequestMapping("/welcome")
    public String loginMessage() {
        return "welcome";
    }

    @RequestMapping("/index")
    public String indexMessage() {
        return "index";
    }


}
