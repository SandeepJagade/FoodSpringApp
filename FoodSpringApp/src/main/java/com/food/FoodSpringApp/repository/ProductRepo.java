package com.food.FoodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodSpringApp.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
