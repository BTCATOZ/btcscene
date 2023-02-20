package com.btcatoz.btcscene.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/news")
    public String news() {
        return "news";
    }
    
    @GetMapping("/board")
    public String board() {
        return "board";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}