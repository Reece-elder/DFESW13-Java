package com.qa.operators;

public class Intro {
	
	// Operators - Symbols that let you manipulate data 
	// +  adds two pieces of data together 
	// *  multiplies two pieces of data
	// -  subtracts two data
	// /  divides data 
	// =  these two are the same
	// == are these two things equal?
	// <  less than (the Crocodile points its mouth are the bigger number) 3 < 10
	// >  more than 
	// <= less than or equal 
	// != not equal to 
	// ++ increments by 1 
	// -- decrements by 1 
	// += increments by a certain amount
	// -= decrements by a certain amount
	// || OR   (is x true OR is y true)
	// && AND  (is x true AND is y true) 
	
	// % modulus - when you divide two numbers, what is the remainder? 
	// 10 / 3 = 3 r1
	// 10 % 3 = 1
	// used for numbers divisible by something (if 32 % 10 = 0) - even or odd  
	
	// A function that adds two nums together 
	// type casting automatically converting data types 
	// byte (tiny number) to long (big number) 
	public static long addNums() {
		
		// Create variables for my numbers 
		// Variable placeholder for data 
		int num1 = 5;
		int num2 = 10; 
		long sum; // Sum is currently undefined 
		
		// Sum is now equal to the value of num1 + num2 
		sum = num1 + num2; 
		
		// Returning sum to the console
		return sum;
		
	}
	
	// Exercise Create methods for the following: 
	// add two nums
	// sub two nums
	// multiply two nums
	// divide two nums
	// return the modulus of two nums 
	// return one num with 1 added to it (using ++) 

}
