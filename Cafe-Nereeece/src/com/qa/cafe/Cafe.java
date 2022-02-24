package com.qa.cafe;

import java.util.ArrayList;

public class Cafe {
	
	// Create my array outside of the method
	static ArrayList<String> orders = new ArrayList<>();
	
	// Individual methods for each of the actions 
	
	public static void addOrder(String order) {
		// Add my order to the array
		orders.add(order);
	}
	
	public static ArrayList<String> printOrders() {
		return orders;
	}

}
