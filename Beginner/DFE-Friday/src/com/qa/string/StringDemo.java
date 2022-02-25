package com.qa.string;

public class StringDemo {
	
	public static void stringIntro() {
		// The standard way of creating a String
		String strLiteral = "Reece";
		String strLiteral2 = "Reece";
		
		// Strings are objects / array of chars 
		// Strings can be created using the new keyword
		String strObject = new String("Reece");
		String strObject2 = new String("Reece");
		
		System.out.println(strLiteral);
		System.out.println(strObject);
		
		// If they are equal it will print true
		// else it will print false
		// Not the same object
		System.out.println(strLiteral == strObject);
		
		// prints true
		System.out.println(strLiteral == strLiteral2);
		
		// print false
		System.out.println(strObject == strObject2);
		
		System.out.println("**********************************");
		// If you want to test the value of a StrObject compared to literal
		System.out.println(strLiteral.equals(strObject));
	}
	
	public static void stringFunctions() {
		
		String str1 = "AbCdEfGhIJKllMN";
		String str2 = "abcdefghijklmnop";
		String strUpper = str1.toUpperCase();
		System.out.println(strUpper);
		// Hello My name is Reece != hello my name is reece
		// Hello my name is reece 
		
		// convert to lowercase
		// print out the string AbCDe.. as all lowercase
		System.out.println(str1.toLowerCase());
		
		// converts to upper case
		System.out.println(str1.toUpperCase());
		
		// Returns true or false if the string starts with this char
		System.out.println(str1.toLowerCase().startsWith("a"));
	}

}
