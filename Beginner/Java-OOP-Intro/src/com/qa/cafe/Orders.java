package com.qa.cafe;

public class Orders {
	
	public String orderType;
	public String size;
	public String user;
	public int orderID = 0;
	public String extras;
	public static int storeID = 471;
	
	public Orders(String orderType, String size, String user, String extras) {
		super();
		this.orderType = orderType;
		this.size = size;
		this.user = user;
		this.orderID++; // Whenever we create a new order, increase orderId by 1
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Orders [orderType=" + orderType + ", size=" + size + ", user=" + user + ", orderID=" + orderID
				+ ", extras=" + extras + "]";
	}
}
