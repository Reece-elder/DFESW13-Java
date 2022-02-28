package com.qa.cakeDemo;

public class Cake {
	
	// Declaring the variables, but not giving them a value
	// You can give these a value, but they likely will be overridden when you create the object
	public String flavour;
	public int layers;
	public boolean icing;
	public String colour;
	
	// Right click > source > generate constructor using fields
	// Creates a constructor automatically using the properties
	public Cake(String flavour, int layers, boolean icing, String colour) {
		// super() - partly a magic word you dont need to know what it does
		// basic description - telling java to use the standard config to create this object
		super();
		this.flavour = flavour;
		this.layers = layers;
		this.icing = icing;
		this.colour = colour;
	}

	
	// When we system out our object it no longer prints 'com.qa.demo@6392fgd' 
	// Prints out all of the values of our object 
	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", layers=" + layers + ", icing=" + icing + ", colour=" + colour + "]";
	}
	
	
	
	

}
