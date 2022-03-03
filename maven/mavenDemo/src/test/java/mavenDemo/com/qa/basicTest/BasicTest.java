package mavenDemo.com.qa.basicTest;

//Using a framework we have downloaded through Maven 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTest {
	
	// Eclipse knows this is a test because of the @Test annotation
	@Test
	public void firstTest() {
		
		System.out.println("Hello World!");
		Assertions.assertTrue(true); // Magic command word, the test passes 
		
	}
	
	// Testing methods generally shouldnt return anything and shouldnt take in params 
	@Test
	public void basicDemo() {
		// We're not testing our code yet
		// At the minute we're just prototyping tests
		
		// I want to test whether 1 + 1 = 2 
		// You would do the sum yourself, 1 add 1 is equal to 2 
		
		// Arrange (Arrange the variables, methods, objects we need)
		int num1 = 1;
		int num2 = 1;
		int sum; 
		
		// Act (Doing the thing we are testing)
		sum = num1 + num2; 
		
		// Assert (Validating the thing we're testing gives us the outcome)
		// Assertions are JUnit built in functions that are used to check values and return true or false
		Assertions.assertEquals(sum, 2);
		
		// assertEquals(2 values)
		// assertNotEquals(2 values not equal)
		// assertTrue(boolean query true, sum > 1)
		// assertFalse(boolean false)

	}
	
	@Test
	public void stringDemo() {
		// Testing if the string "red" is equal to "red"
		// Arrange
		String testQuery = "red";
		
		// Act
		testQuery = "ReD";
		String newQuery = testQuery.toLowerCase();
		System.out.println(newQuery);
		
		// Assert
		Assertions.assertEquals("red", newQuery);
	}
	
	// Exercise - Create a test class 
	// Create tests to test the following: 
	// 5 * 10 = 50
	// 1 + 2 + 3 + 4 
	// 23 / 4 
	// 27 - 19
	// "blue" = "blue"
	// "red" + "triangle" = "red triangle"
	// 10 * 3 != 40
	
	
	@Test
	public void blueIsBlue() {
		// Arrange
		String query;
		
		// Act
		query = "blue";
		
		// Assert
		Assertions.assertEquals("blue", query);
	}
	
	@Test
	public void redTriangle() {
		// Arrange
		String queryColour = "red";
		String queryShape = "triangle";
		String wholeQuery;
		
		// Act
		wholeQuery = queryColour + " " + queryShape;
		
		// Assert
		Assertions.assertEquals("red triangle", wholeQuery);
	}
	
	@Test 
	public void tenTimes() {
		// using not *technically* the test is fine and has coverage 
		// 10 * 3 is not 40 - should always be testing for what something is and not what it is not
		
		// Arrange
		int num1 = 10;
		int num2 = 3;
		int sum;
		
		// Act
		sum = num1 * num2;
		
		// Assert
		Assertions.assertFalse(sum == 40);
	}
	
	// double equal to 5.92 
	// int chops off the decimal, leaves the whole number = 5
	@Test
	public void divisionOne() {
		// 23 / 4
		double num1 = 23;
		double num2 = 4;
		double sum;
		
		sum = num1/num2;
		System.out.println(sum);
		
		Assertions.assertEquals(5.75, sum);
		
	}
	
	// generally not using hard coded in numbers 
	// generally not arithmetic 

}
