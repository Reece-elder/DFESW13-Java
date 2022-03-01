package com.qa.inheritence;


public class Pigeon extends Bird {
	
	// property
	private int chipsStolen;
	
	// constructor (using bird super constructor)
	public Pigeon(int wingSpan, int chipsStolen) {
		super(wingSpan);
		this.chipsStolen = chipsStolen;
	}
	
	// getters and setters
	
	public int getChipsStolen() {
		return chipsStolen;
	}

	public void setChipsStolen(int chipsStolen) {
		this.chipsStolen = chipsStolen;
	}
	
	public void fly() {
		System.out.println("Flying through the air!");
	}
	
	
	
	

}
