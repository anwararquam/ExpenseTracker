package com.ExpenseTracker.Technio.repository;

import com.ExpenseTracker.Technio.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
