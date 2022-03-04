package com.qa.exercises;

import java.util.Random;

public class DiceTask {
	
	// A method that rolls a dice of x size, adding 1 (to account for 0)
	public static int rollDice(int x) {
		return new Random().nextInt(x) + 1;
	}
	
	public static int exerciseOne() {
		int result = 0;
		
		// Each increment rolls the dice and adds the value to result
		result += rollDice(6);
		result += rollDice(6);
		result += rollDice(6);
		result += rollDice(6);
		
		return result;
		
	}
	
	public static int exerciseTwo() {
		int result = 0;
		result += rollDice(10);
		result += rollDice(10);
		result += rollDice(6);
		
		return result;
	}

}
