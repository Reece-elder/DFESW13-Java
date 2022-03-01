package com.qa.runner;

import java.util.ArrayList;

import com.qa.abstractionExercise.Chameleon;
import com.qa.abstractionExercise.Reptile;
import com.qa.cafe.Cafe;
import com.qa.cafe.Orders;
import com.qa.cakeDemo.CakeOverload;
import com.qa.cakeDemo.CakeTin;
import com.qa.encapsulation.Horse;
import com.qa.inheritence.Bird;
import com.qa.inheritence.Penguin;
import com.qa.inheritence.Pigeon;
import com.qa.objectsLists.Habitat;
import com.qa.objectsLists.Lizards;
import com.qa.polymorphism.Pizza;
import com.qa.pracAbstraction.Cat;
import com.qa.pracAbstraction.HouseCat;
import com.qa.pracAbstraction.Lion;

public class Runner {

	public static void main(String[] args) {
		/*
		
		// From our runner we need to run our constructor method
		
		// Declare our object type (CakeTin / Cake)
		// New object 
		
		// CakeTin is the data type
		// spongeCake is the name of the variable
		// equal to new(command word) then the name of the class
		CakeTin spongeCake = new CakeTin("vanilla", 2, false, "beige");
		
		// give us an id reference (similar to print out an array)
		System.out.println(spongeCake);
		
		System.out.println(spongeCake.flavour);
		
		
		// Make a new object with my new class
		Cake caterpillarCake = new Cake("Choc", 1, true, "brown, sprinkles");
		Cake carrotCake = new Cake("carrot", 2, true, "orange");
		System.out.println(caterpillarCake.colour);
		System.out.println(carrotCake.colour);
		System.out.println(carrotCake.cakeWidth);
		
		
		// To run the method of the class 
		Cake.makeMould();
		System.out.println(Cake.cakeWidth);
//		Cake.cookCake(5); - WE CAN'T ACCESS THE instanced VARIABLES FROM THE CLASS
		
		// Run the method of the object by accessing the object
		caterpillarCake.cookCake(45);
		caterpillarCake.makeMould(); // We can do this.. but don't.
		
		
		Cake blackForest = new Cake("Cherry, choc", 5, true, "Black");
		System.out.println(blackForest); // Have a value of 3 for the cakesMade
		System.out.println(Cake.cakesMade);
		
		// Exercise - with your current class
		// Add an instanced method (prints out something) 
		// Add a static method (prints out something) 
		// Add a static variable you can print out (increases when create a new object, id of the class..)
	
		CakeOverload regularCake = new CakeOverload("almond", 2, true, "yellow");
		CakeOverload birthdayCake = new CakeOverload(4, false, "white", 23);
	
		
		// Create my manager object
		Habitat newHabitat = new Habitat();
//		Habitat frogHabitat = new Habitat();
		
		// Creating a lizard to use
		Lizards terry = new Lizards("Terry", "Green" , 8, true);
		
		// Add my lizard to my habitat
		newHabitat.addLizard(terry);
		
		newHabitat.printHabitat();
		
		
		
		Cafe starReece = new Cafe();
		Cafe pretAReece = new Cafe();
		
		Orders flatWhite = new Orders("flat white", "small", "Hassan", "sprinkles");
		Orders pumpkinSpice = new Orders("pumpkin spice", "medium", "Aidan", "salted caramel sauce");
		
		starReece.printAll();
		starReece.addOrder(pumpkinSpice);
		starReece.printAll();
		starReece.updateOrder(0, flatWhite);
		starReece.printAll();
		
		
		// ENCAPSULATION (top)
		
		Horse seaBiscuit = new Horse(true, 12, "chestnut brown", "show jumping");
		System.out.println(seaBiscuit.getColour()); // we cant do this because the variable is private
		seaBiscuit.setJob("baker");
		System.out.println(seaBiscuit.getJob());
		
		// Exercise - Create a class of an animal of your choice
		// Give the animal 4 private properties
		// Use getters and setters to access the values 
		// add verification (e.g if colour == "gold") to two of your setters 
		// print out the values of your animal 
		
		// ENCAPSULATION (bottom)
		
		// INHERITANCE (top)
		
		Penguin percy = new Penguin(15, 6);
		percy.swim();
		System.out.println(percy.layEgg());
		System.out.println(percy.getWingSpan());
		percy.printBirdType(percy.getType());
		
		Pigeon tony = new Pigeon(7, 791);
		tony.fly();
		System.out.println(tony.layEgg());
		System.out.println(tony.getWingSpan());
		
		Bird pingu = new Penguin(12, 1);
		// will I be able to access the variables, methods
		pingu.layEgg(); // do methods connected to bird, not methods connected to penguin
		
//		Penguin pingu2 = new Bird(7);
		
		// Exercise - With the animal you made getters and setters for 
		// IF you can add a parent class and another child class 
		// make your child classes inherit the parent class
		// pass atleast 1 property and 1 method
		// child classes should have atleast 1 unique property and method
		
		// INHERITANCE (bottom)

		
		// ABSTRACTION (top)
		
//		Cat defaultCat = new Cat - cant do this because cat is an abstract class
		Cat tony = new Lion(4, false, true, 9); // Lion == Cat, but we can't create a Cat 
		Cat zaph = new HouseCat(4, false, false, "blue"); 
		
		// How could I create a list which contains both animals?
		ArrayList<Cat> listOfCats = new ArrayList<>();
		listOfCats.add(zaph);
		listOfCats.add(tony);
		System.out.println(listOfCats);
		
		// Exercise 
		// - Make a parent abstract class animal with 2 properties and 1 abstract method
		// - Make 1 interface which does a system print out
		// - Make a child class which extends off of the parent class AND implements interface
		// - Create the child object in the runner 
		
		Reptile callum = new Chameleon("tree", "chameleon", 6, "Cricket");
		System.out.println(callum.useCamouflage());
		
		// ABSTRACTION (bottom)

				  
		*/
		
		// POLYMORPHISM
		
		Pizza pepperoni = new Pizza(12, "pepperoni", false);
		System.out.println(pepperoni);
		
		// POLYMORPHISM
	}

}
