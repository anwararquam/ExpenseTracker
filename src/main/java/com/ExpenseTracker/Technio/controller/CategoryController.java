package com.ExpenseTracker.Technio.controller;

import com.ExpenseTracker.Technio.model.Category;
import com.ExpenseTracker.Technio.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @PostMapping
    public Category createCategory(@RequestBody Category categorydetails){
        return categoryRepository.save(categorydetails);
    }

}
