package com.qa.runner;

// Importing all classes from the package com.qa.colourPrint
import com.qa.colourPrint.*;
import com.qa.dataTypes.DataTypes;

public class Runner {

	public static void main(String[] args) {
		
		// I want to access the method in class printRed
		// We want to access the class PrintRed
		System.out.println(PrintRed.returnRed());
		System.out.println(DataTypes.returnBool());
		System.out.println(DataTypes.returnFalse());
	}
	
	// Exercise - Convert a recent project to use a runner package as well as a package
	// for your exercises. Make your runner import in the method from the other class 

}
