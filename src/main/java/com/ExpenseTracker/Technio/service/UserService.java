package com.ExpenseTracker.Technio.service;

import com.ExpenseTracker.Technio.model.Users;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    public List<Users>getAll();
    public ResponseEntity<Users>getUserById(Long id);

    public ResponseEntity<Users> updateUserById(long id,Users userdetails);

    public ResponseEntity<Users>deleteUser(Long id);
}
