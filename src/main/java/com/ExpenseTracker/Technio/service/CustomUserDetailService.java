package com.ExpenseTracker.Technio.service;
import com.ExpenseTracker.Technio.model.Users;
import com.ExpenseTracker.Technio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user=userRepository.findByEmail(username).orElseThrow(()->new RuntimeException("User Not Found"));
        return user;
    }
}
