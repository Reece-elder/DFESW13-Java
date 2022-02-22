package com.qa.dataTypes;

public class DataTypes {
	
	// In java there are two types of data
	// Primitive - raw data, is stored in memory (has a lowercase letter)
	// Object    - References to multiple pieces of primitive data (Has a capital letter)
	
	// Data types are generally lowercase APART from String
	// Strings are collections of char primitive data types 
	
	// The smaller the number you can use, means less memory
	// In most cases this is negligible
	
	// String  - Text "Blue"
	// int     - whole number 100
	// boolean - true / false 
	// float   - decimal 1.23f
	// char    - single char 'a'
	// double  - large decimal number 1.283034048494
	// byte    - small number between -128 to 127 
	// short   - medium / small number between -32760 and 32760 
	// long    - number of long length 73738383837383738310

	
	public static String returnStr() {
		return "text";
	}
	
	public static int returnInt() {
		return 123;
	}
	
	public static boolean returnBool() {
		// returns true / false with lowercase 
		return true;
	}
	
	// Java is explictly typed language
	// We need to specify what type of data we're returning
	
	public static boolean returnFalse() {
		// true is not a String 
		return false;
	}

}
