package com.ExpenseTracker.Technio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Expense")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long expense_id;
    @Column(name = "title")
    private String title;
    @Column(name = "categoryId")
    private String category_id;
    @Column(name = "amount")
    private int amount;
    @Column(name = "date")
    private String date;
    @Column(name = "createdAt")
    private String createdAt;
    @Column(name = "ModifiedAt")
    private String ModifiedAt;
}
