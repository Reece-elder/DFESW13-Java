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

}
