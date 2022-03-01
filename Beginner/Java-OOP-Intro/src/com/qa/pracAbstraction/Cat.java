package com.qa.pracAbstraction;

// Abstract classes CANNOT BE DIRECTLY CREATED
// Objects which extend off of Cat can be
public abstract class Cat {
	
	private int legs = 4;
	private boolean stripes;
	private boolean dangerous;

	// Constructor - Isn't useful without classes extending
	// WHen a class extends off of Cat it needs to be able to grab these values 
	
	public Cat(int legs, boolean stripes, boolean dangerous) {
		super();
		this.legs = legs;
		this.stripes = stripes;
		this.dangerous = dangerous;
	}
	
	// Getters and Setters

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isStripes() {
		return stripes;
	}

	public void setStripes(boolean stripes) {
		this.stripes = stripes;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}
	
	// Abstract Method
	// This method is not useful as an abstract method, only useful when a child inherits it and modifies it 
	public abstract String noise();
}
