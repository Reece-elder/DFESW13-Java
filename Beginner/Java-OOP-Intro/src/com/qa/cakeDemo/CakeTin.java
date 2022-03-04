package com.qa.cakeDemo;

// CakeTin the class will be used to create cakes
public class CakeTin {
	
	// flavour - String
	// layers  - int
	// icing   - boolean
	// colour  - String
	
	// Are the properties of our cakes
	public String flavour;
	public int layers;
	public boolean icing;
	public String colour;
	
	// To create a cake, we need a method called a 'constructor'
	// constructors take in values and use them to make 'objects'
	
	// Doesn't take in a return type (because it returns a CakeTin) 
	// Isn't static, because static is a method only classes can do
	public CakeTin(String flavourParam, int layersParam, boolean icingParam, String colourParam) {
		
		// this - the object coming from THIS class (Object of type cake tin, Cake) 
		// the flavour of THIS cake is equal to the param we pass in
		this.flavour = flavourParam;
		this.layers = layersParam;
		this.icing = icingParam;
		this.colour = colourParam;
		
	}

}
