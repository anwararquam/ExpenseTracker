package com.ExpenseTracker.Technio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "Expense")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Expense  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private Long expenseid;
    @Column(name = "title")
    private String title;

    @Column(name = "amount")
    private int amount;
    @Column(name = "date")
    private String date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",  nullable = true)
    private Users user;
    @OneToOne(cascade = CascadeType.ALL)
    private Category category;

}
