package com.qa.abstraction;

// Flamingo will inherit the values from our abstract class Bird
// to tell my flamingo to use the interface, implements <interface name>
public class Flamingo extends Bird implements EatsPrawns, LayEgg {
	
	private String colour;
	
	public Flamingo(String colour) {
		super(); 
		// Inherits the Bird constructor
		// there is no bird constructor because you can't
		// make an object from an abstract class
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	// Made a new method called noise() that is not abstract
	@Override
	public void noise() {
		System.out.println("roar + flamingo noise");
		System.out.println("*slurps down prawns*");
	}

	@Override
	public String layEgg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eatPrawns() {
		// TODO Auto-generated method stub
		
	}
}
