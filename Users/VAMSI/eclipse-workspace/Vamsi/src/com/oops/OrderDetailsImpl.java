package com.oops;

//import java.util.Scanner;

public class OrderDetailsImpl implements FoodOrder{
 
	int orderId;
	String CustomerName;
	double price;
	
	public OrderDetailsImpl(int orderId,String CustomerName,double price) {
		super();
		this.orderId=orderId;
		this.CustomerName=CustomerName;
		this.price=price;
		
	}

	@Override
	public void displayDetails(int orderId,String CustomerName,double price) {
		System.out.println("Order ID: "+orderId);
		System.out.println("Customer Name: "+CustomerName);
		System.out.println("Price: "+price);
	}

	public static void main(String[] args) {
			
	}

	 

}
