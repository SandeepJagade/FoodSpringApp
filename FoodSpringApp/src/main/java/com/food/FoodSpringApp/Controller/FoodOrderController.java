package com.food.FoodSpringApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.FoodSpringApp.dao.FoodOrderDao;
import com.food.FoodSpringApp.dto.FoodOrder;


@RestController
@RequestMapping("/foodOrders")
public class FoodOrderController {

	@Autowired
	FoodOrderDao foodOrderDao ;
	
	@PostMapping
	public FoodOrder placeFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderDao.saveFoodOrder(foodOrder) ;
		
 	}
	
}

