package com.qa.blackjack;

public class BlackJack {
	
	// Recreate the blackjack exercise, returning the values as I need 
	// The only *real* way to test a method, is check what it returns 
	
	public static int blackJack(int x, int y) {
		
		if(x > 21 && y > 21) {
			System.out.println("Both over 21");
			return 0;
		} else if(x > 21) {
			System.out.println("x is over 21");
			return y;
		} else if(y > 21) {
			System.out.println("y is over 21");
			return x;
		} else if (x > y) {
			System.out.println("neither over 21 but x is greater");
			return x;
		} else {
			System.out.println("neither over 21, either the same value or y is greater");
			return y;
		}
		
		// Run this from the main and check the syso - sanity 
		// With coverage 
		// Green - Tested and succesful
		// Yellow - Branching code, haven't fully tested it
		// Red - Not tested OR test fails
		
		// Exercise - Go back and test one of your exercises covered in the week
		// Iteration exercises, make sure they return something
		// Conditionals 
		// If you cant find a nice one, create a basic calculator and test those methods
	}

}
