package com.ExpenseTracker.Technio.controller;

import com.ExpenseTracker.Technio.model.Users;
import com.ExpenseTracker.Technio.service.UserService;
import com.ExpenseTracker.Technio.service.UserServiceD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserServiceD userServiceD;

    @GetMapping("/users")
    public List<Users>getUser(){
        System.out.println("getting users");
        return userServiceD.getUser();
    }
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
