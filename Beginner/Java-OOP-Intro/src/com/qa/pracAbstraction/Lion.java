package com.qa.pracAbstraction;

// Lion will extend off of Cat
public class Lion extends Cat {
	
	private int antelopesEaten;

	// Constructor to create a lion with params, using the Cat Constructor
	public Lion(int legs, boolean stripes, boolean dangerous, int antelopesEaten) {
		super(legs, stripes, dangerous);
		this.antelopesEaten = antelopesEaten;
	}
	
	public int getAntelopesEaten() {
		return antelopesEaten;
	}

	public void setAntelopesEaten(int antelopesEaten) {
		this.antelopesEaten = antelopesEaten;
	}

	@Override
	public String noise() {
		// TODO Auto-generated method stub
		return null;
	}
}
