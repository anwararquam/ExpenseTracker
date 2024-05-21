package com.ExpenseTracker.Technio.service;

import com.ExpenseTracker.Technio.model.Users;
import com.ExpenseTracker.Technio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceD {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public Users createUser(Users user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public List<Users>getUser(){
        return userRepository.findAll();
    }


}
