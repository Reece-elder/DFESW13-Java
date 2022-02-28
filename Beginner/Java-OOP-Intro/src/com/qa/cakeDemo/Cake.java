package com.qa.cakeDemo;

public class Cake {
	
	// Declaring the variables, but not giving them a value
	// You can give these a value, but they likely will be overridden when you create the object
	public String flavour;
	public int layers;
	public boolean icing;
	public String colour;
	public static int cakeWidth = 10; // First object set value of 6, 2nd value of 8 
	public static int cakesMade = 0;
	
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
		cakesMade++; // Everytime we make a cake, increase cakesMade by 1
	}
	
	// Within my Cake class Create a method that we can access 
	// Doesnt have the word static BECAUSE this method is for the OBJECT 
	// To run this method we need to access the OBJECT not the CLASS
	// If not static is called 'instanced'
	public void cookCake(int cookingTime) {
		System.out.println("Cake put in oven");
		System.out.println("Cake in oven for: " + cookingTime);
		System.out.println("Cake cooked!");
	}
	
	// static means its for the CLASS
	public static void makeMould() {
		System.out.println("cake tin made");
	}

	
	// When we system out our object it no longer prints 'com.qa.demo@6392fgd' 
	// Prints out all of the values of our object 
	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", layers=" + layers + ", icing=" + icing + ", colour=" + colour + "]";
	}
	
	
	
	

}
