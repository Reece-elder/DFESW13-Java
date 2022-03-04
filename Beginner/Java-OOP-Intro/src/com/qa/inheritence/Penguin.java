package com.qa.inheritence;

// If we want our class to inherit Bird
// we write extends Bird
public class Penguin extends Bird {
	
	// property
	private int fishEaten;
	private String type = "Penguin";
	// inherited property - wingspan

	// this constructor takes in wingspan AND fisheaten
	public Penguin(int wingSpan, int fishEaten) {
		super(wingSpan); // wingspan used to make a bird
		this.fishEaten = fishEaten; // fisheaten used to make a penguin
	}
	
	// Getters and setters 
	public int getFishEaten() {
		return fishEaten;
	}

	public void setFishEaten(int fishEaten) {
		this.fishEaten = fishEaten;
	}
	
	// Getter for animal type
	public String getType() {
		return type;
	}

	public void swim() {
		System.out.println("just keep swimming.. swimming..");
	}
	
	// our penguin class is inheriting the layEgg()
	// Override annotation is saying "this is the newer method"
	@Override // @ above a method is an annotation 
	public String layEgg() {
		return "sitting on egg to keep it warm";
	}
	
	// exercise - Override one of the parent class methods with a new method
	

}
