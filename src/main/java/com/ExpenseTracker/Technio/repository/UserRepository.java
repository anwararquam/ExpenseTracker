package com.ExpenseTracker.Technio.repository;

import com.ExpenseTracker.Technio.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<Users,Long> {
    public Optional<Users> findByEmail(String email);
}
