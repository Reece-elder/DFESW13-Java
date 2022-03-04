package com.qa.runner;

import com.qa.pizza.Pizza;

public class Runner {
	
	// Before I can run any methods or do anything 
	
	public static void main(String[] args) {
		
		// To create a new object of type pizza
		// Pizza     - the data type of the object being created 
		// pepperoni - the name of this variable
		// Classes and object data types ALWAYS START WITH A CAPITAL LETTER
		// Variables ALWAYS ARE lowerCamelCase
		
		// new       - To use the constructor
		// Pizza()   - Saying use the constructor of class Pizza(pass in params) 
		Pizza pepperoniPizza = new Pizza(null, 0, false);
		
		// Act of running the constructor returns an object of type Pizza
		// Storing this object as pepperoniPizza stores it in Java Memory 
		
		System.out.println(pepperoniPizza.getSlices());
		
	}

}
