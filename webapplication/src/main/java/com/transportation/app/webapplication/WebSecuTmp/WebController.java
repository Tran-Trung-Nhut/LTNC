package com.transportation.app.webapplication.WebSecuTmp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping(value={"/","/public"})
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    } 
}
