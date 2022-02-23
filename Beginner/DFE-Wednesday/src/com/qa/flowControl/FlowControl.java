package com.qa.flowControl;

public class FlowControl {
	
	public static String printRed() {
		System.out.println("Call stack = Main + printRed()");
		return "Red";
	}
	
	public static String printBlue() {
		System.out.println("Call stack = Main + printBlue()");
		return "Blue";
	}
	
	public static String printGreen() {
		System.out.println("Call stack = Main + printGreen()");
		return "Green";
	}

}
