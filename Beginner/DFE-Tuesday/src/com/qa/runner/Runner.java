package com.qa.runner;

// Importing all classes from the package com.qa.colourPrint
import com.qa.colourPrint.*;
import com.qa.dataTypes.DataTypes;
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
	}
	
	// Exercise - Convert a recent project to use a runner package as well as a package
	// for your exercises. Make your runner import in the method from the other class 

}
