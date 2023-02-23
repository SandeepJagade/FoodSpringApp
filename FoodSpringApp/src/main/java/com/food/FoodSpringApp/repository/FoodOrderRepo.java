package com.food.FoodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodSpringApp.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer> {

	


}
