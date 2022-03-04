package com.qa.pracAbstraction;

public class HouseCat extends Cat{
	
	private String collarColour;

	public HouseCat(int legs, boolean stripes, boolean dangerous, String collarColour) {
		super(legs, stripes, dangerous);
		this.collarColour = collarColour;
	}

	public String getCollarColour() {
		return collarColour;
	}

	public void setCollarColour(String collarColour) {
		this.collarColour = collarColour;
	}

	@Override
	public String noise() {
		// TODO Auto-generated method stub
		return "Purrrrrrrrr";
	}

	@Override
	public String toString() {
		return "HouseCat [collarColour=" + collarColour + ", legs" + getLegs() + ", Stripes" + isStripes()
				+ ", isDangerous()=" + isDangerous() + "]";
	}


	
	
	
	

}
