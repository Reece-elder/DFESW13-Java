package com.qa.cafe;

import java.util.ArrayList;

public class Cafe {
	
	// Make my array which takes in orders
	public ArrayList<Orders> orders = new ArrayList<>();
	
	public void addOrder(Orders order) {
		orders.add(order);
	}
	
	public void updateOrder(int index, Orders order) {
		orders.set(index, order); // Set takes in the index of the object to update 
								  // and what value you want to update it to 
	}
	
	public void printAll() {
		System.out.println(orders);
	}

}
