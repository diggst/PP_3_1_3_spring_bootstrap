package com.example.firstsecurityapp.controllers;

import com.example.firstsecurityapp.security.UserDetailsImp;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String index(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImp userDetails = (UserDetailsImp)authentication.getPrincipal();
        model.addAttribute("user", userDetails.getUser());
        return "user";
    }
}