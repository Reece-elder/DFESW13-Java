package com.qa.runner;

import com.qa.exercises.DiceTask;
import com.qa.flowControl.FlowControl;
import com.qa.flowControl.MethodStack;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println("main added to stack");
//		System.out.println(MethodStack.firstLayer(7));
//		System.out.println(MethodStack.scoreManager(10));
		
		System.out.println(DiceTask.exerciseOne());
		System.out.println(DiceTask.exerciseTwo());
		
		System.out.println("main left stack");
		
//		System.out.println(FlowControl.printRed());
//		
//		System.out.println("Call stack = Main");
//		
//		System.out.println(FlowControl.printBlue());
//		
//		System.out.println("Call stack = Main");
//		
//		System.out.println(FlowControl.printGreen());
		
	}

}
