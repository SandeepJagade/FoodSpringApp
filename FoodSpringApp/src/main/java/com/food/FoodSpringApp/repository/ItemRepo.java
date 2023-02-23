package com.food.FoodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodSpringApp.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
