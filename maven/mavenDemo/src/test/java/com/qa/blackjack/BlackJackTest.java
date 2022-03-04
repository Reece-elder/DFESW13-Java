package com.qa.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackTest {
	
	@Test
	public void blackJackOne() {
		// Arrange
		int x = 18;
		int y = 15;
		
		// Act - Doing the action we're testing
		// Save a variable as the return of your method
		int result = BlackJack.blackJack(x, y);
		
		// Assert
		Assertions.assertEquals(x, result);
	}
	
	@Test
	public void blackJackTwo() {
		// Arrange
		int x = 13;
		int y = 15;
				
		// Act - Doing the action we're testing
		// Save a variable as the return of your method
		int result = BlackJack.blackJack(x, y);
				
		// Assert
		Assertions.assertEquals(y, result);
	}
	
	// Each test SHOULD ONLY TEST ONE THING
	
	public int blackJackSetup(int x, int y) {
		// Act - Doing the action we're testing
		// Save a variable as the return of your method
		return BlackJack.blackJack(x, y);
		
	}
	
	@Test
	public void blackJackOver21() {
		// Act
		int result = blackJackSetup(23, 32);
		
		// Assert
		Assertions.assertEquals(0, result);
	}
	
	@Test
	public void blackJackXOver21() {
		// Act
		int result = blackJackSetup(23, 18);
		
		// Assert
		Assertions.assertEquals(18, result);
	}

}
