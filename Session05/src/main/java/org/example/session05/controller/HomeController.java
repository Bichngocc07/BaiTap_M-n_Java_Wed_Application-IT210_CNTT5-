package org.example.session05.controller;

import org.example.session05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home (){
        return "home";
    }

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public String SBJYF(Model model){
        model.addAttribute("users",userService.findAll());
        return "users";
    }
}
