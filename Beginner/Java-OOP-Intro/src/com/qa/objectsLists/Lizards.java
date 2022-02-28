package com.qa.objectsLists;

public class Lizards {
	
	// Properties
	public String name;
	public String colour;
	public int length;
	public boolean cute;


	
	// Generate constructor AND toString (Shift + Alt + S - same as right clicking and clicking source)
	
	public Lizards(String name, String colour, int length, boolean cute) {
		super();
		this.name = name;
		this.colour = colour;
		this.length = length;
		this.cute = cute;
	}
	
	@Override
	public String toString() {
		return "Lizards [name=" + name + ", colour=" + colour + ", length=" + length + ", cute=" + cute + "]";
	}

}
