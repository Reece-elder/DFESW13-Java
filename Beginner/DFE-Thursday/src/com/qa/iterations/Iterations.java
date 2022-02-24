package com.qa.iterations;

public class Iterations {
	
	// Iterations allow you to repeat code blocks until a specific condition is met
	// Loops / iterations are used in generally every programming language to add functionality
	// 3 types of loop
	
	// for loop - Checks for a numerical value (when you know how many times the loop should run)
	// while    - Checks for a boolean value, used when you dont know how many times loop should run
	// do while - Code block runs first THEN while checks condition (always runs atleast once)
	
	// Loops run some code UNTIl a condition is met 
	
	public static void whileDemo() {
		
		int cleanCups = 10; 
		
		// Make a loop that uses a new cup until we run out of cups (and have to wash up)
		// query for clean cups being above 0 
		while(cleanCups > 0) { // While there are still clean cups, do this loop
			System.out.println("No need to wash up, another cup used");
			
			// To stop my loop running forever ensure I minus one cup each loop
			cleanCups--;
			
			System.out.println("cups left: " + cleanCups);
		}
		
		String colour = "red";
		
		while(colour == "blue") {
			System.out.println("colour :" + colour);
		}
		
		System.out.println("Loop never runs because colour is not blue");
		
	}
	
	public static void doWhileDemo() {
		
		// The difference between a while loop and a dowhile loop
		// is a do while ALWAYS RUNS ATLEAST ONCE - condition is checked at the end
		
		String colour = "red";
		
		do {
			System.out.println("colour :" + colour);
		} while (colour == "blue");
		
		int score = 0;
		
		// Increase score by 5 each loop
		// do this until score is atleast 47
		// You want the loop to stop at a specific number, 
		// use greater or less than to cover 'edge cases'
		do {
			score += 5; 
			System.out.println("Score: " + score);
		} while(score != 47); // while the score is less than 47 do this thing
		
	}
	
	// Most common type of loop, 
	public static void forLoop() {
		// Three components
		// - Initialisation (initial value)
		// - Condition (what we're checking for)
		// - Iterator (how we move our initial value to the condition) 
		// set i to 0, do a thing, increase i by 1, when i gets to 10 stop loop
		
		
		// count to 10, what value am I printing out?
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("*******************************");
		
		// Count to 20 increasing by 3 starting at 2
		
		for(int i = 2; i <= 20; i+=3) {
			System.out.println(i);
		}
		
		System.out.println("===============================");
		
		// Count down from 30 by 7, til we get to -6
		for(int i = 30; i >= -6; i-=7) {
			System.out.println(i);
		}
		
	}

}
