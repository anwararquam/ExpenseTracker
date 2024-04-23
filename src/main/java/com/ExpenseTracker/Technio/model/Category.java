package com.ExpenseTracker.Technio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Category")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    @Column(name = "CategoryName")
    private String category_name;
    @Column(name = "CreatedAt")
    private String created_at;
    @Column(name = "ModifiedAt")
    private String modified_at;

}
