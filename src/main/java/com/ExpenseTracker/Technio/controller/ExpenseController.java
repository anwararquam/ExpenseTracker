package com.ExpenseTracker.Technio.controller;

import com.ExpenseTracker.Technio.model.Expense;
import com.ExpenseTracker.Technio.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/expense")
@RestController
public class ExpenseController {
    @Autowired
    private ExpenseRepository expenseRepository;
    public Expense createExpense(@RequestBody Expense expensedetails){
        return expenseRepository.save(expensedetails);
    }
}
