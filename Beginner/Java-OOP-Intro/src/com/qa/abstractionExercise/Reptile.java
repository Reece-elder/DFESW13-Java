package com.qa.abstractionExercise;

public abstract class Reptile implements Camouflage {
	
	private String habitat; 
	private String type;
	private int length;
	
	// Constructor
	public Reptile(String habitat, String type, int length) {
		super();
		this.habitat = habitat;
		this.type = type;
		this.length = length;
	}

	// Getters and Setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	// Abstract method
	
	public abstract String noise();
	
	
	
	

}
