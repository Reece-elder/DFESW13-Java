package com.qa.conditionals;

public class Exercises {
	
//	Given 2 integer values greater than 0, return whichever is closest to 21 
//	without going over 21. If they both go over 21 then return 0
	
	// What to do if they are both the same value, house wins 
	public static int Blackjack(int x, int y) {
		
		if(x > 21 && y > 21) {
			return 0;
		} else if (x > 21) { // if both of them aren't over 21 AND x is over 21 - y has won
			return y;
		} else if (y > 21) {
			return x;
		} else if (x > y) {
			return x;
		} else {
			return y;
		}
		
	}
	
	public static boolean flowchart(int a) {
		
		if(a > 2000) {
			System.out.println("A");
			if(a > 6000) {
				System.out.println("C");
				return true;
			} else {
				System.out.println("B");
				if(a > 4000) {
					System.out.println("D");
					return true;
				} else {
					System.out.println("E");
					return true;
				}
			}
		} else {
			return true;
		}
		
	}

}
