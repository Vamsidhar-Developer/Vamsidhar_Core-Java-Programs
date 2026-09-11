package com.oops;

import java.util.Scanner;

public class OrderDetails2 implements FoodOrder2 {

	Scanner sc = new Scanner(System.in);
	int orderID;
	String customerName;
	double price;

	@Override
	public void prepareFood() {

	}

	public void getInput() {
		System.out.println("Please Enter Your OrderID: ");
		orderID = sc.nextInt();
		System.out.println("Please Enter your Name: ");
		customerName = sc.next();
		System.out.println("Please Enter the Item Price: ");
		price = sc.nextDouble();
	}

	void display() {
		System.out.println("Product ID: " + orderID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Price : " + price);
	}

	public static void main(String[] args) {

	}

}
