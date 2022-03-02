package mavenDemo.com.qa.basicTest;

//Using a framework we have downloaded through Maven 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTest {
	
	@Test
	public void firstTest() {
		
		System.out.println("Hello World!");
		Assertions.assertTrue(true); // Magic command word, the test passes 
		
	}
	
	// Used maven to install and use an external dependency 

}
