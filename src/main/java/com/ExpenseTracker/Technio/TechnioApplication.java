package com.ExpenseTracker.Technio;

import com.ExpenseTracker.Technio.model.Category;
import com.ExpenseTracker.Technio.model.Expense;
import com.ExpenseTracker.Technio.model.Users;
import com.ExpenseTracker.Technio.repository.CategoryRepository;
import com.ExpenseTracker.Technio.repository.ExpenseRepository;
import com.ExpenseTracker.Technio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class TechnioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TechnioApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private ExpenseRepository expenseRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		Users user=new Users();
		user.setUsername("arquam");
		user.setEmail("arquam65@gmail.com");
		user.setPassword("Madiha@12");

		Expense expense=new Expense();
		expense.setAmount(1000);
		expense.setTitle("Toy");
		expense.setDate(String.valueOf(LocalDate.now()));
		expense.setUser(user);

		Category category=new Category();
		category.setCategory_name("Hajj");
		category.setExpense(expense);


		expense.setCategory(category);
		expenseRepository.save(expense);
	}
}
