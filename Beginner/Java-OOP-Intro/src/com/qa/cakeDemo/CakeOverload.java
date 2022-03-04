package com.qa.cakeDemo;

// It doesnt have to be called this to work, just to clarify what we're doing
public class CakeOverload {
	
	public String flavour;
	public int layers;
	public boolean icing;
	public String colour;
	public int numberOfCandles; // What do we put if we dont want any candles?
	public static int cakeWidth = 10; 
	public static int cakesMade = 0;

	
	// Have seperate constructors that change what properties we want to put in
	// Constructor WITH candles
	// Constructor WITHOUT candles 
	
	// Overloading = Having more than one constructor in one class
	
	// Creates a cake without flavour
	public CakeOverload(int layers, boolean icing, String colour, int numberOfCandles) {
		super();
		this.layers = layers;
		this.icing = icing;
		this.colour = colour;
		this.numberOfCandles = numberOfCandles;
	}

	// Creates a cake without candles
	public CakeOverload(String flavour, int layers, boolean icing, String colour) {
		super();
		this.flavour = flavour;
		this.layers = layers;
		this.icing = icing;
		this.colour = colour;
	}

	// Creates a cake with flavours and a layer
	public CakeOverload(String flavour, int layers) {
		super();
		this.flavour = flavour;
		this.layers = layers;
	}

	// Wont be happy because we already have a constructor for(String, int)
//	public CakeOverload(String colour, int numberOfCandles) {
//		super();
//		this.colour = colour;
//		this.numberOfCandles = numberOfCandles;
//	}


	
	
	
	
	
	
	
	
	
	

}
