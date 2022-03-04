package com.qa.abstraction;

// To make this class an abstract class
// use the word abstract infront of class
public abstract class Bird {
	
	// Bird is now a blueprint, will not have a constructor but can have methods and variables
	
	// Standard method
//	public void layEgg() {
//		System.out.println("Laid an egg!");
//	}
	
	// Abstract method - an abstract method with no body
	// Any child classes that use this MUST SPECIFY WHAT noise() does
	// ensure all child classes have a method called noise() with each class specifying what it does 
	public abstract void noise();
	
	// Standard variable
	public int wingSpan;

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
}
