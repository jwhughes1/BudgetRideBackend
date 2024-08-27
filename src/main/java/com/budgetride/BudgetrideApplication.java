package com.budgetride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages 
= {"com.budgetride.backend.controller", "com.budgetride.backend.service"})
public class BudgetrideApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetrideApplication.class, args);
	}

}
// Create unit test - yacine's suggestions
