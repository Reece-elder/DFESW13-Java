
public class ReturnRecap {
	
	public static void main(String[] args) {
		
		// Tell my main to print out what printRed returns
		System.out.println(printRed());
		
	}
	
	// This method returns the text "Red"
	// Any code written AFTER return won't be run
	public static String printRed() {
		System.out.println("Method fired!");
		return "Red";
	}
	
	// Exercise - Create a new project and class
	// Class should contain 1 main method and 1 method called print<colour> that returns a colour
	// Main should run and print out the colour

}
