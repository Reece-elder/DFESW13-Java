package com.qa.operators;

public class Calculator {
	
	// Passing in paramaters into methods
	// Having a placeholder variable in a method that can be populated when ran
	
	// Everytime this is ran it will return 30
	// How can we change these numbers? 
	public static int multiply() {
		int num1 = 10;
		int num2 = 3;
		int sum;
		
		sum = num1 * num2;
		return sum;
	}
	
	// When running this method we pass in two nums, x and y  multiplyParams(2,5)
	public static int multiplyzipzoop(int x, int y) {
		
		// x = whatever user puts in
//		x = 5;
//		y = 2;
		// x = 5
		
		// x and y are declared in the method name
		// sum equal to x and y multiplied together
		int sum = x * y;
		return sum;
	}
	
	// With paramaters being passed in you can use any data type (and any number or combo of data types)
	public static void helloWorld(String name, int favNum) {
		System.out.println("Hello World, my name is " + name);
		System.out.println("my fav number is " + favNum);
	}
	
	// If statements (conditionals) are used by computers to do certain things
	// depending on certain conditions
	
	// if colour is red return true, else return false
	public static boolean isRed(String colour) {
		
		// if is the command word
		// (query)
		// {what to do if query is true}
		if(colour == "red") {
			return true;
		} else {
			return false;
		}
		
	}

}
