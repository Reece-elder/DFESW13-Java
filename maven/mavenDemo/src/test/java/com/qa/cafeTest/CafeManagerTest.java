package com.qa.cafeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.qa.cafe.CafeManager;

// Add this annotation to 'fix it' 
@TestInstance(Lifecycle.PER_CLASS)
public class CafeManagerTest {
	
	// before I can access the methods, I need to do what?
	// my cafe methods are instanced (not static)
	// we need to create a cafe object
	
	// I will be running my tests on testCafe
	CafeManager testCafe = new CafeManager();
	
	
	// Setup Method Runs before all of the tests
	@BeforeAll
	public void setup() {
		System.out.println("Runs before all tests");
		
		// Before ANY tests run, 3 coffess have been added to the ArrayList
		testCafe.addOrder("test1"); // 0
		testCafe.addOrder("test2"); // 1
		testCafe.addOrder("test3"); // 2
	}
	
	
	// BlackJack - Class
	// blackJack - method
//	BlackJack.blackJack(5, 7);
	@Test
	public void addTest() {
		// Arrange
		String coffeeType = "testCoffee";
		String result;
		
		// Act
		result = testCafe.addOrder(coffeeType);
		
		// Assert
		Assertions.assertEquals("testCoffee added to order Array :)", result);
		
//		CafeManager.addOrder("latte"); // accessing the CLASS
//		testCafe.addOrder("latte"); // accessing the object
		
	}
	@Test
	public void removeTest() {
		// Arrange
		int index = 0;
		String result;
		
		// Act
		result = testCafe.removeOrder(index);
		
		// Assert
		Assertions.assertEquals("test1", result);
	}
	
	// Tests should ALWAYS WORK INDEPENDENT OF EACH OTHER
	// if my removeTest ONLY WORKS if the add works before it..
	// Not valid testing 
	// Setup functions which run before all other tests to setup our environment
	// JUnit tests don't necessarily work top to bottom 
}
