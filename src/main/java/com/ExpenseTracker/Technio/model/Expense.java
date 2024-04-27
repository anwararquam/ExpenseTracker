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
public class Expense implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private Long expenseid;
    @Column(name = "title")
    private String title;
    @Column(name = "categoryId")
    private String category_id;
    @Column(name = "amount")
    private int amount;
    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name="user_id",  nullable = true)
    private Users user;
    @OneToOne(mappedBy = "expense")
    private Category category;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
