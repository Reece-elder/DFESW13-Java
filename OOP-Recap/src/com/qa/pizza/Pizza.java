package com.qa.pizza;

// Our class to create an object of type pizza
// All objects not extending off of a custom class extend off of Object
public class Pizza {
	
	// variables at top
	private String toppings;
	private int slices;
	private boolean stuffedCrust; 
	
	// Static variable
	// All objects come from class Pizza
	// The variable pizzaShop is stuck to the class Pizza 
	private static String pizzaShop = "Newport";

	// Constructor
	// public   - anything within this package can access this
	// Pizza    - the data type this method returns 
	// __       - absence of a method name, because this is a constructor
	// (params) - What we're populating the fields (toppings, slices etc) with when creating the object 
	public Pizza(String toppings, int slices, boolean stuffedCrust) {
		// super() - This custom object inherits data from Object
		// ()      - Object doesnt take in any params
		super();
		
		// this.variable - 'this' the object currently being generated and returned 
		this.toppings = toppings;
		this.slices = slices;
		this.stuffedCrust = stuffedCrust;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public boolean isStuffedCrust() {
		return stuffedCrust;
	}

	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	}
	
	
	
	
	
	

}
