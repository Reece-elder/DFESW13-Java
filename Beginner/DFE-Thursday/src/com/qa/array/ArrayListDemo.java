package com.qa.array;

import java.util.ArrayList;

public class ArrayListDemo {
	
	// ArrayLists are a type of 'collection' in Java
	// Collection is a framework to organise data better
	
	// Arraylists are resizable, meaning you can add and remove items as you want
	
	public static void pizzaShop() {
		
		String[] wordArray;
		
		// Want to create our array list
		// ArrayList<Data Type of array> nameOfArray = new ArrayList<>();
		// Ctrl + shift + o - sorts out imports
		ArrayList<String> pizzaArray = new ArrayList<>();
		System.out.println("Before adding stuff");
		System.out.println(pizzaArray);
		
		// add value
		pizzaArray.add("Pepperoni");
		pizzaArray.add("Ham and Pineapple");
		pizzaArray.add("Nutella");
		pizzaArray.add("Melon");
		pizzaArray.add("Texas BBQ");
		
		System.out.println("After adding stuff");
		System.out.println(pizzaArray);
		
		// remove value
		// Plug in the name OR the index and it removes it
		pizzaArray.remove("Pepperoni");
		
		// sort values
		
		// read indiviudal values by index
		System.out.println(pizzaArray.get(1));
		
		// enhanced for loop
		for(String pizza : pizzaArray) {
			System.out.println(pizza);
		}
		
		// update values takes in an index number to find
		// replaces with the new "String"
		pizzaArray.set(2, "Kiwi with extra skin");
		
		// remove all values - removes everything
		pizzaArray.clear();
		
		// swap values 
		
        // ability to read all values
		System.out.println(pizzaArray);
		
		
	}

}
