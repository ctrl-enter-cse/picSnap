package com.prasanna.picSnap.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prasanna.picSnap.model.User;
import com.prasanna.picSnap.service.UserService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        System.out.println(model);
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        // Implement user registration logic
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(User user, HttpSession session, Model model) {
        // Implement user login logic and session management
        return "redirect:/feed";
    }

    @GetMapping("/logout")
    public String logoutUser(HttpSession session) {
        // Implement user logout logic and session invalidation
        return "redirect:/login";
    }
}