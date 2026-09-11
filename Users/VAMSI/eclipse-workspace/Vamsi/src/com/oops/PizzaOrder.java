package com.oops;

public class PizzaOrder extends OrderDetailsImpl{

	public PizzaOrder(int orderId, String CustomerName, double price) {
		
		super(orderId, CustomerName, price);	
	}

	public static void main(String[] args) {
	 
	System.out.println("***Welcome to Pizza Order Page***");
	PizzaOrder p1=new PizzaOrder(10, "vamsi", 1001);
 
	p1.displayDetails(p1.orderId,p1.CustomerName,p1.price);
	

	}

}
