package com.oops;

import java.util.Scanner;

class Product {

	int productID;
	String productName;
	Double price;

	Scanner sc = new Scanner(System.in);

	void displayProductDetails() {
//		System.out.println("Please Enter your Product ID: ");
//		productID = sc.nextInt();
//		System.out.println("Please Enter your Product Name: ");
//		productName = sc.next();
//		System.out.println("Please Enter Your Product Price: ");
//		price = sc.nextDouble();

		System.out.println("Product Id: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);

	}

	void calculateDiscount() {

		double totalPrice = price - (price * 5 / 100);
		System.out.println("Your Total Bill After Discount: " + totalPrice);

	}

}

class Electronics extends Product {

	String brand;

	@Override
	void displayProductDetails() {
		System.out.println("Please Enter your Product ID: ");
		productID = sc.nextInt();
		System.out.println("Please Enter your Product Name: ");
		productName = sc.next();
		System.out.println("Please Enter Your Product Price: ");
		price = sc.nextDouble();
		System.out.println("Please Enthe the Brand Name: ");
		brand = sc.next();

		System.out.println("Product Id: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
		System.out.println("Brand Name: " + brand);

	}

	@Override
	void calculateDiscount() {

		double totalPrice = price - (price * 10 / 100);
		System.out.println("Your Total Bill After Discount: " + totalPrice);
	}

}

class Clothing extends Product {

	int size;

	@Override
	void displayProductDetails() {
		System.out.println("Please Enter your Product ID: ");
		productID = sc.nextInt();
		System.out.println("Please Enter your Product Name: ");
		productName = sc.next();
		System.out.println("Please Enter Your Product Price: ");
		price = sc.nextDouble();
		System.out.println("Please Enthe the Cloth Size : ");
		size = sc.nextInt();

		System.out.println("Product Id: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
		System.out.println("Your Cloth Size: " + size);

	}

	@Override
	void calculateDiscount() {

		double totalPrice = price - (price * 15 / 100);
		System.out.println("Your Total Bill After Discount: " + totalPrice);
	}

}

class Furniture extends Product {
	String material;
	

	@Override
	void displayProductDetails() {
		System.out.println("Please Enter your Product ID: ");
		productID = sc.nextInt();
		System.out.println("Please Enter your Product Name: ");
		productName = sc.next();
		System.out.println("Please Enter Your Product Price: ");
		price = sc.nextDouble();
		System.out.println("Please Enthe the MAterial Name : ");
		material = sc.next();

		System.out.println("Product Id: " + productID);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
		System.out.println("Your Material : " + material);

	}

	@Override
	void calculateDiscount() {

		double totalPrice = price - (price * 20 / 100);
		System.out.println("Your Total Bill After Discount: " + totalPrice);
	}

}

public class AbstractTestDemo3 {

	public static void main(String[] args) {

		Electronics p1 = new Electronics();
		Clothing p2 = new Clothing();
		Furniture p3 = new Furniture();

		int price;

		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome to V-cart Online Shopping Portal***");

		System.out.println("Please Enter Your Choice \n1.Electronics \n2.Clothing \n3.Furniture");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("***You Choose Electronics Product Page***");
			p1.displayProductDetails();

			p1.calculateDiscount();
			break;
		case 2:
			System.out.println("***You Choose Clothing Product Page***");
			p2.displayProductDetails();

			p2.calculateDiscount();
			break;
		case 3:
			System.out.println("***You Choose Furniture Product Page***");
			p3.displayProductDetails();

			p3.calculateDiscount();
			break;
		default:
			System.out.println("Invalid Choice");

		}

	}

}
