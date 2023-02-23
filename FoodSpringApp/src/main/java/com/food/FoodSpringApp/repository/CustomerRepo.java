package com.food.FoodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodSpringApp.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	Customer findByEmail(String email);

}
