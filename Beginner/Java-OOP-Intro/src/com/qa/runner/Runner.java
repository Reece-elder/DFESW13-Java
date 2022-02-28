package com.qa.runner;

import com.qa.cakeDemo.Cake;
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
		
		
		// Make a new object with my new class
		Cake caterpillarCake = new Cake("Choc", 1, true, "brown, sprinkles");
		System.out.println(caterpillarCake);
		
		// Exercise - Comment out your old constructor, generate a new one
		// Generate a toString
		// Create an object and print it out 
		

	}

}
