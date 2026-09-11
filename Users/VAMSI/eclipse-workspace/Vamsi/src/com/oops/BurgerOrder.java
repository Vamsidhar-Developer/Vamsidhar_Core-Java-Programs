package com.oops;

public class BurgerOrder extends OrderDetailsImpl{
  


	public BurgerOrder(int orderId, String CustomerName, double price) {
		super(orderId, CustomerName, price);
		 
	}

 
	public static void main(String[] args) {
		System.out.println("***Welcome to Burger Order Page***");
		
		BurgerOrder b1=new BurgerOrder(11, "venu", 599);
		 
		b1.displayDetails(b1.orderId,b1.CustomerName,b1.price);
	}

}
