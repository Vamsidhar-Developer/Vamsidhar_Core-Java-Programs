package com.oops;

import java.util.Scanner;

public class ShoppingCartDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ShoppingCart s1 = new ShoppingCart();

		s1.setCartItems(0);
		s1.setTotalAmount(0.0);
		char opinion;
		 
				 
		do {
			System.out.println("Present Items in your Cart :" + s1.getCartItems());

		    System.out.println("Present Your Total Amount :" +s1.getTotalAmount());

			System.out.println("Please Select An Option : \n1.Add Item \n2.Remove Item \n3.Exit");
			int choice = sc.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("Please Add The Items to the Cart: ");
			int items = sc.nextInt();
			System.out.println("Enter price of each item:"); 
			double price = sc.nextDouble();
			s1.addItems(items, price);
			System.out.println("Added Items : " + items);
			System.out.println("Total Amount: " + s1.getTotal());
			break;

		case 2:
			if (s1.getCartItems()==0) {
				System.out.println("Np items found in the cart");
				
			}else {
			System.out.println("Please Remove The Items to the Cart: ");
			int items2 = sc.nextInt();
			System.out.println("Enter price of each item:");
			double price2 = sc.nextDouble();
			s1.removeItems(items2, price2);
			System.out.println("Removed Items : " + items2);
			System.out.println("Total Amount: " + s1.getTotal());
			break;
			}
		case 3:
			System.out.println("Exited Successfully");
			sc.close();
			break;
				
		default:
				System.out.println("Invalid Choice");
		}
	
			System.out.println("Do you want to continue (Y or N) :");
			 opinion=sc.next().charAt(0);
		}
		while(opinion =='Y' || opinion =='y');
		
		System.out.println("Thank you visit again  Vamsi Shopping Portal !!!");
		 

	}

}
