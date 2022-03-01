package com.qa.polymorphism;

// Pizza extends Object
public class Pizza {
	
	public int slices;
	public String topping;
	public boolean stuffedCrust;
	
	
	public Pizza(int slices, String topping, boolean stuffedCrust) {
		super(); // super just means parent. Uses the default Object() parent constructor
		this.slices = slices;
		this.topping = topping;
		this.stuffedCrust = stuffedCrust;
	}
	
	

}
