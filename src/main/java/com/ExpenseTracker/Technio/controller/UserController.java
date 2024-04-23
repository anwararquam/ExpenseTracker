package com.ExpenseTracker.Technio.controller;
import com.ExpenseTracker.Technio.error.ResourceNotFoundException;
import com.ExpenseTracker.Technio.model.Users;
import com.ExpenseTracker.Technio.repository.UserRepository;
import com.ExpenseTracker.Technio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;
public class UserController implements UserService {
    List<Users>LIST_USERS=new ArrayList<>();
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getAll() {
        return userRepository.findAll();

    }
    @Override
    public ResponseEntity<Users> getUserById(@PathVariable  Long id) {
        Users user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User is not Registered"));
        return ResponseEntity.ok(user);
    }
    @Override
    public ResponseEntity<Users> updateUserById(@PathVariable long id,@RequestBody Users userdetails) {
        Users updateduser=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found with the credentials Provided"));
        updateduser.setEmail(userdetails.getEmail());
        updateduser.setUsername(userdetails.getUsername());
        updateduser.setPassword(userdetails.getPassword());
        userRepository.save(updateduser);
        return ResponseEntity.ok(updateduser);
    }
    @Override
    public ResponseEntity<Users> deleteUser(@PathVariable Long id) {
        Users user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User Not Found To Delete"));

        userRepository.delete(user);
        return ResponseEntity.ok(user);
    }
}
