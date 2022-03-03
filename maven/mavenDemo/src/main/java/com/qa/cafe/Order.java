package com.qa.cafe;

public class Order {
	
	// Attributes
	private String type;
	private String size;
	private String customer;
	private boolean dairyFree;
	
	
	public Order(String type, String size, String customer, boolean dairyFree) {
		super();
		this.type = type;
		this.size = size;
		this.customer = customer;
		this.dairyFree = dairyFree;
	}


	@Override
	public String toString() {
		return "Order [type=" + type + ", size=" + size + ", customer=" + customer + ", dairyFree=" + dairyFree + "]";
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public boolean isDairyFree() {
		return dairyFree;
	}


	public void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
	}
	
	// Equals and Hashcode
	// com.qa.cafe 93fHD8e@Cafe
	// the id string is the 'hashcode' generating a new hashcode using these specific values 
	// Two orders with the same attribute 'should' have the same hashcode (equals methods) 
	

	// Lets us compare the values of two objects (type, size, dairyfree..) rather than their memory reference
	// If two objects have a type of mocha, medium, reece, dairy free they are considered equal 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + (dairyFree ? 1231 : 1237);
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (dairyFree != other.dairyFree)
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
