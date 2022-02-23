package com.qa.conditionals;

public class Demo {
	
	public static void basicDemo(int x) {
		
		// Basic conditionals use if, else and if else
		// x is larger than 5 
		if(x > 5) {
			System.out.println("larger than 5");
		} else if (x < 5) {
			System.out.println("less than 5");
		} else {
			System.out.println("x is 5");
		}
		
		if(x >= 5) {
			System.out.println("x is larger than OR equal to 5");
		} else {
			System.out.println("x is less than 5 ");
		}
		
	}
	
	public static void compoundDemo(boolean bool, String colour, int num) {
		
		// || - pipes, used for OR 
		// If statements for testing if 
		// bool equal to true and colour = red 
		// bool is true colour not red
		// bool is false and colour is red
		// bool is false and colour is not red
		
		if(bool == true && colour == "red") {
			System.out.println("bool is true and colour is red");
		} else if (bool == true && colour != "red") { // colour is NOT equal to "red" 
			System.out.println("Bool is true and colour is not red");
		} else if (bool == false && colour == "red") {
			System.out.println("bool is false and colour is red");
		} else {
			System.out.println("bool is false and colour is not red");
		}
		
		// bool is true OR colour is red 
		// With an OR it doesnt mean one must be true the other must not, 
		// Means both OR either of them must be true 
		if(bool == true || colour == "red") { // if bool is true OR (colour is red AND num higher than 7)
			// bool = true, colour not red x
			// bool = true, colour = red x
			// bool = false, colour = red x
			// Only situation that isnt true is bool = false AND colour != red x
			if(bool != true) {
				System.out.println("bool is false and colour is red");
			} else if (colour != "red") {
				System.out.println("bool is true and colour is not red");
			} else {
				System.out.println("bool is true and colour is red ");
			}
			
		} else {
			System.out.println("bool is false and colour is not red");
		}
		
		
		
	}

}
