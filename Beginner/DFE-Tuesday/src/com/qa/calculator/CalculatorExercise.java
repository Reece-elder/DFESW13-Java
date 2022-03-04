package com.qa.calculator;

public class CalculatorExercise {
	
	// Methods for add, sub, multiply, divide
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		
		if(y > x) {
			System.out.println("Y cannot be greater than X");
			return x;
		} else {
			return x - y;
		}
		

	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		
		if(y == 0) {
			System.out.println("Cant divide by zero");
			return x;
		} else if(x == 0 ) {
			System.out.println("Cant divide 0");
			return y;
		} else {
			return x / y;
		}
	}
	
	public static String evenOdd(int x) {
		
		// If you divide x by 2 and have a remainder of 0
		// x is even
		if(x % 2 == 0) {
			return x + " is even";
		} else {
			return x + " is odd";
		}
		
	}
	
	public static double raisePower(int x, int y) {
		return Math.pow(x, y);
	}
	
	
	
	// My main will call this method
	public static void calculateMethods() {
		System.out.println(add(3,6));
		System.out.println(sub(10,13));
		System.out.println(multiply(2, 4));
		System.out.println(divide(10, 0));
		System.out.println(evenOdd(11));
		System.out.println(raisePower(2, 2));
		
	}

}
