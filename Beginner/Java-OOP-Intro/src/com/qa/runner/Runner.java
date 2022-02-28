package com.qa.runner;

import com.qa.cakeDemo.CakeTin;

public class Runner {

	public static void main(String[] args) {
		
		// From our runner we need to run our constructor method
		
		// Declare our object type (CakeTin / Cake)
		// New object 
		
		// CakeTin is the data type
		// spongeCake is the name of the variable
		// equal to new(command word) then the name of the class
		CakeTin spongeCake = new CakeTin("vanilla", 2, false, "beige");
		
		// give us an id reference (similar to print out an array)
		System.out.println(spongeCake);
		
		System.out.println(spongeCake.flavour);
		
		/* Exercise 
		 * Plan what object you want and what properties you want
		 * Create a new project
		 * Create a new class to create objects out of (Animal, food) 
		 * This class MUST have atleast 4 properties, including String, boolean, int
		 * Create a constructor for your class
		 * Make your runner create the object 
		 */
		

	}

}
