package com.qa.cafeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.qa.cafe.CafeManagerObject;
import com.qa.cafe.Order;

//Add this annotation to 'fix it' 
@TestInstance(Lifecycle.PER_CLASS)
public class CafeManagerObjectTest {
	
	
	CafeManagerObject testCafe = new CafeManagerObject();
	Order test1 = new Order("testType1", "small", "john doe", false);
	Order test2 = new Order("testType2", "small", "john doe", false);
	Order test3 = new Order("testType3", "small", "john doe", false);
	
	@BeforeAll
	public void setup() {
		
//		testCafe.addOrder("string")
		testCafe.addOrder(test1);
		testCafe.addOrder(test2);
		testCafe.addOrder(test3);
		
	}
	
	@Test
	public void readIndexTest() {
		// Arrange
		int index = 1;
		Order nullOrder; // An empty order object
		// we will be populating null order with the return
		
		// Act - nullOrder (empty object) equal to order of index 1
		nullOrder = testCafe.readByIndex(index);
		
		// Assert
		Assertions.assertEquals(test2, nullOrder);
		// if(test2 == nullOrder){
		//		return true
		
	}
	
	@Test
	public void addTest() {
		// Arrange
		String result;
		
		// Act
		result = testCafe.addOrder(test1);
		
		// Assert
		Assertions.assertEquals("testType1 added to order array!", result);
		
	}
	
	@Test
	public void readAll() {
		// Arrange
		String result;
		String expected = "[Order [type=testType1, size=small, customer=john doe, dairyFree=false], Order [type=testType2, size=small, customer=john doe, dairyFree=false], Order [type=testType3, size=small, customer=john doe, dairyFree=false], Order [type=testType1, size=small, customer=john doe, dairyFree=false]]";
		
		// Act
		// Takes the arraylist, converts to a string and saves as variables result
		result = testCafe.readAll().toString();
		
		
		// Assert
		Assertions.assertEquals(expected, result);
	}
	
	// Test Driven Development
	// Write a test to test if the code does this
	// Write the code to do the function
	// Check if the test works or not 

}
