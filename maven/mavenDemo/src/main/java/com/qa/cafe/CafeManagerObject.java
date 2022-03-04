package com.qa.cafe;

import java.util.ArrayList;

public class CafeManagerObject {
	
	public ArrayList<Order> orderArray = new ArrayList<Order>();

	public String addOrder(Order drink) {
		orderArray.add(drink);
//		System.out.println(drink.getType());
		
		// mocha, flat white, drink
		return drink.getType() + " added to order array!";
	}
	
	public Order readByIndex(int index) {
		return orderArray.get(index);
	}
	
	// Returns the entire array of orders
	public ArrayList<Order> readAll() {
		return orderArray;
	}
}
