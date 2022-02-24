package com.qa.runner;

import com.qa.cafe.Cafe;

public class Runner {
	
	public static void main(String[] args) {
		Cafe.addOrder("Flat White");
		System.out.println(Cafe.printOrders());
	}

}
