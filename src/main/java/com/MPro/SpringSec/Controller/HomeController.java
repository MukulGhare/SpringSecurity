package com.MPro.SpringSec.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Welcome to Home Page " + request.getSession().getId();
    }
}
