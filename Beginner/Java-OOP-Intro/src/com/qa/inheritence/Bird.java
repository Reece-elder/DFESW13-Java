package com.qa.inheritence;

public class Bird {
	
	// method to inherit
	public String layEgg() {
		return "laid an egg";
	}
	
	// property to inherit
	private int wingSpan;
	
	// Create a constructor in my Bird class
	public Bird(int wingSpan) {
		super();
		this.wingSpan = wingSpan;
	}

	// Getters and setters
	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	
	

}
