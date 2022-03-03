package com.qa.iteration;

public class IterationsExercise {
	
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

}
