package com.qa.array;

public class ArrayDemo {
	
	// Arrays allow us to store multiple like values as a single variable
	// String is an array of chars ('a')
	
	// Arrays in Java can only store the same type of variable
	// Array of colours, numbers, booleans, ints
	
	// Arrays in Java are immutable, 
	// meaning the Data type (int) and length cannot change (how many items in the array) 
	
	// Arrays are like trains, you cant change from a cargo to a passenger train
	// You can't lose cars in the train
	// But the passengers or cargo can change 
	
	public static void arrayExample() {
		
		// Array of pasta types
		String[] pastaTypes; // Empty array with no values and no length set
		
		String[] pastaValues = {"Spaghetti", "Penne", "Gnocci"}; // An array with 3 values
		System.out.println(pastaValues); 
		// Prints out the id reference to the memory 
		// Object data types are not actual variables, just references to data
		
		// Arrays are indexed from 0, the first item is 0 
		System.out.println(pastaValues[0]);
		
		int[] numArray = {44, 11, 430, 7, 10, 99, 36, 210, 13};
		// Index of 99 - 5 
		// index of 7 - 3
		// Index of 44 - 0
		// index of 210 - 7
		System.out.println(numArray[7]);
		System.out.println(numArray[0]); // -2 is not between 0 and 9
		System.out.println(numArray.length); // prints out length of array (how many items)
		
		pastaValues[0] = "Tortellini"; // Updating the value of the 0th index
		System.out.println(pastaValues[0]);
		
		System.out.println("================================");
		System.out.println(pastaValues.length);
//		pastaValues[3] = "Tagiatelle";
//		System.out.println(pastaValues.length);
		
		
		// Printing out the values of our pasta array
		// Starting from 0 (the first index) 
		// for every element in the array (using the length)
		for(int i = 0; i < pastaValues.length; i++) {
			System.out.println(i);
			System.out.println(pastaValues[i]);
		}
		
		// Enhanced for loop - we dont need to specify length, i++ or initial value
		// For every element in pastaValues
		// give it a variable name of 'pasta'
		// do this (syso) with 'pasta'
		for(String pasta : pastaValues) {
			System.out.println(pasta);
		}
		
	}

}
