package com.ecommerce.management;

import java.util.Scanner;

public class ECommerceImpl implements Ecommerce{
	
	Scanner sc=new Scanner(System.in);
	@Override
	public String getCustomerId() {
		System.out.println("Please Enter Your User-ID: ");
		String id=sc.next();
		return id;
	}
	@Override
	public String getCustomerName() {
		System.out.println("Please Enter Your User-Name: ");
		String userName=sc.next();
		return userName;	
	}
	@Override
	public String getCustomerEmail() {
		System.out.println("Please Enter Your Valid E-Mail: ");
		String email=sc.next();
		return email;
	}
	@Override
	public String getCustomerPhone() {
		System.out.println("Please Enter Your Valid Phone Number: ");
		String number=sc.next();
		return number;
	}
	@Override
	public boolean isEmailValid(String email) {
		return email.matches("[a-zA-Z0-9%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
 	}
	@Override
	public boolean isPhoneValid(String number) {
		return number.matches("[6-9]{1}[0-9]{9}");
	}
	@Override
	public int getProductID(){
		System.out.println("Please Enter the Product ID:");
		System.out.println("\nID-1(Laptop) \nID-2(I-Phone) \nID-3(I-Pad)");
		int productID=sc.nextInt();
		return productID;
	}
	@Override
	public int getProductQuantity(){
		System.out.println("Please Enter The Product Quantity: ");
		int quantity=sc.nextInt();
		return quantity;
	}
	@Override
	public double CalculateTotalAmount(){
		System.out.println("Please Enter the Price of the Product: ");
		double price=sc.nextDouble();
		System.out.println("Please Enter Your the Quantity: ");
		int quantity=sc.nextInt();
		double total=(quantity*price);
		return total;
	}
	@Override
	public void displayWelcomeMessage() {
		System.out.println("Welcome to the V-Cart Online Shopping Portal");
	}
 
 
	public static void main(String [] args) {
		
	}

}
