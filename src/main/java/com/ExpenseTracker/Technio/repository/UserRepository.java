package com.ExpenseTracker.Technio.repository;

import com.ExpenseTracker.Technio.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

}
