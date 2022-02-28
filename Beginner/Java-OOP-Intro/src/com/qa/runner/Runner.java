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
		Cake carrotCake = new Cake("carrot", 2, true, "orange");
		System.out.println(caterpillarCake.colour);
		System.out.println(carrotCake.colour);
		System.out.println(carrotCake.cakeWidth);
		
		
		// To run the method of the class 
		Cake.makeMould();
		System.out.println(Cake.cakeWidth);
//		Cake.cookCake(5); - WE CAN'T ACCESS THE instanced VARIABLES FROM THE CLASS
		
		// Run the method of the object by accessing the object
		caterpillarCake.cookCake(45);
		caterpillarCake.makeMould(); // We can do this.. but don't.
		
		
		Cake blackForest = new Cake("Cherry, choc", 5, true, "Black");
		System.out.println(blackForest); // Have a value of 3 for the cakesMade
		System.out.println(Cake.cakesMade);
		
		// Exercise - with your current class
		// Add an instanced method (prints out something) 
		// Add a static method (prints out something) 
		// Add a static variable you can print out (increases when create a new object, id of the class..)
	
	}

}
