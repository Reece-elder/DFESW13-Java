package com.qa.iterations;

public class Exercises {

	public static void flowchartTwo() {

		int a = 100;

		do {
			// If a is even
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			a++;

		} while (a <= 200);

	}
	
	public static void flowChartFor() {
		// For loop has the three components
		for(int a = 100; a<= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("- " + a);
			} else {
				System.out.println("* " + a);
			}
		}
	}
	
	public static void questionFive() {
		int y = 0;
		
		// a standard 1 to 10 for loop
		for(int i = 1; i <= 10; i++) {
			System.out.println("First loop runs");
			// Nested for loops
			// Print 1 - 10, 10 times
			for(int x = 1; x <= i; x++) {
				System.out.println(i);
			}
			
		}
		
	}

}
