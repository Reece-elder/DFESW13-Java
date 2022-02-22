package com.qa.runner;

// Importing all classes from the package com.qa.colourPrint
import com.qa.colourPrint.*;
import com.qa.dataTypes.DataTypes;
import com.qa.operators.Calculator;
import com.qa.operators.Intro;
import com.qa.packageRecap.PackageRecap;

public class Runner {

	public static void main(String[] args) {
		
		// I want to access the method in class printRed
		// We want to access the class.method()
		System.out.println(PrintRed.returnRed());
		System.out.println(DataTypes.returnBool());
		System.out.println(DataTypes.returnFalse());
		System.out.println(PackageRecap.printName());
		System.out.println(Intro.addNums());
		System.out.println(Calculator.multiplyzipzoop(12, 5));
		System.out.println(Calculator.multiplyzipzoop(98, 632));
		Calculator.helloWorld("Reece", 36);
		System.out.println(Calculator.isRed("blue"));
	}
	
	/*
	 Exercise - Convert your sum methods to take in 2 params and return the value
	 		  - Add a method that returns if a number is even or odd
	 		  - Add checks to divide to make sure you don't divide by 0
	 		  - Add checks to make sure the 2nd number when you subtract is not larger than the 1st
	 */

}
