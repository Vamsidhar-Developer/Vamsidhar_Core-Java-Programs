package com.logicalstatements;

import java.util.Scanner;

public class OnlineShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("******* WELCOME V-CART ONLINE SHOPPING PAGE *******");
		
		System.out.println("Enter Purchase Amount: ");
		double amount=sc.nextDouble();
		
		if(amount >= 1000) {
			System.out.println("Enter Membership Status(Yes/No): ");
			
			boolean status=sc.nextBoolean();
			
			if(status == true) {
				amount=amount-20*amount/100;
				System.out.println("You got 20% discount on Total Bill Amount: "+amount);
				
			}else {

			amount=amount-10*amount/100;
			System.out.println("You got 10% discount on Total Bill Amount: "+amount);
			}
			
		}else {
			System.out.println("You Are Not Eligible for Getting Discount");
		}
		sc.close();
		
		
	}

}
