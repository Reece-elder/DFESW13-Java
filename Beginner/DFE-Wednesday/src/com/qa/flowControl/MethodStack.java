package com.qa.flowControl;

import java.util.Random;

public class MethodStack {
	
	public static int firstLayer(int x) {
		System.out.println("first Layer added to stack");
		
		// Make a variable called result equal to what secondLayer returns
		int result = secondLayer(x);
		
		// Return result (the int secondlayer returned)
		System.out.println("first layer left stack");
		return result;
	}
	
	public static int secondLayer(int x) {
		System.out.println("Second layer added to stack");
		System.out.println("Second layer left stack");
		return x * 2;
	}
	
	public static int scoreManager(int result) {
		System.out.println("Score manager added to stack");
		
		// Increment random by a random number between 0 and 6
		// 4 + -6 = -2 
		result += randomNumber();
		System.out.println(result);
		result += randomNumber();
		System.out.println(result);
		
		System.out.println("score manager left stack");
		return result;
		
	}
	
	public static int randomNumber() {
		// Returns a random number between 0 and 6
		// requires importing Random.util
		System.out.println("Random Number added to stack");
		System.out.println("Random Number left stack");
		return new Random().nextInt(6);
	}
}
