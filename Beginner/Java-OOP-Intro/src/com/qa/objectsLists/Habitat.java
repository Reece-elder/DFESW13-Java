package com.qa.objectsLists;

import java.util.ArrayList;

// Called a manager class, which has methods for my objects
public class Habitat {
	
	// Contains an array list for all of my lizards 
	// Contains the methods to add, remove, update etc. 
	
	// Creating an array list with the data type being Lizards
	public ArrayList<Lizards> lizardRock = new ArrayList<>();
	
	// my method to add lizards to the habitat
	// Takes in an object of type Lizards
	public void addLizard(Lizards newLizard) {
		// Adds this lizard to the array list
		lizardRock.add(newLizard);
	}
	
	public void printHabitat() {
		System.out.println(lizardRock);
	}
	
	// We don't need a constructor, because there are no params
    // to put in

}
