package com.qa.cafe;

import java.util.ArrayList;

public class CafeManager {
	
	// Methods I need are: 
	// addOrder
	// removeOrder
	// updateOrder
	// readAllOrders
	// readByIndex
	// removeAll
	// getSizeOrder
	
	// (Easy) Put the word String in the end <>
	// (Tougher) Changing the version of JRE using the Configure BuildPath
	public ArrayList<String> orderArray = new ArrayList<String>();
	
	// All methods should return something
	public String addOrder(String order) {
		orderArray.add(order);
		return order + " added to order Array :)";
	}
	
	public String removeOrder(int index) {
		return orderArray.remove(index);
	}
	
	public String updateOrder(int index, String order) {
		return orderArray.set(index, order);
	}
	
	public ArrayList<String> readAll() {
		return orderArray;
	}
	
	public String readByIndex(int index) {
		return orderArray.get(index);
	}
	
	public String removeAll() {
		orderArray.clear();
		return "all orders removed";
	}
	
	

}
