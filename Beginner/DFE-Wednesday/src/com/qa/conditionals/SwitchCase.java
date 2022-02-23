package com.qa.conditionals;

public class SwitchCase {
	
	// Switch case statements are used when we have a large if else statement chain
	// Days of the week (if (day == "monday")) 
	// Used by having a single variable you're checking for
	
	public static int fruitSwitchCase(String fruit) {
		
		int rating = 0;
		
		// This is the variable we're telling it to listen to, can be any data type
		switch(fruit) {
			 
		case "kiwi": // case - this is the code block for if fruit = kiwi
			System.out.println("Kiwis are best eaten WITH THE PEEL");
			rating = 10;
			break;   // break - used to stop other cases from happening
			
		case "watermelon":
			System.out.println("Overrated fruit imho");
			break;
			
		case "mango": 
			System.out.println("very good fruit, impractical to cut tho");
			break;
			
		default: // else {} used if the switch isnt covered by one of the above cases
			System.out.println("Thats not a fruit.. maybe");
			break;
		} 
		
		return rating;
		
	}

}
