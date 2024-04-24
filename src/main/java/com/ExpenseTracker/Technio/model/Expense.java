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
    private Long expense_id;
    @Column(name = "title")
    private String title;
    @Column(name = "categoryId")
    private String category_id;
    @Column(name = "amount")
    private int amount;
    @Column(name = "date")
    private String date;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_at", nullable = false)
    private Date ModifiedAt;
    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
        ModifiedAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        ModifiedAt =new Date();
    }

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id", nullable = true)
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
