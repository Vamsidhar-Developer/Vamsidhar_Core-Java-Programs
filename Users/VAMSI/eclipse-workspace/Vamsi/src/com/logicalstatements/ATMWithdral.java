package com.logicalstatements;

import java.util.Scanner;

public class ATMWithdral {

	public static void main(String[] args) {
		
		System.out.println("******* Welcome to Bharat Bank ATM *******");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your 4 Digit ATM Pin"); 
		int pin=sc.nextInt();
		
		if(pin==2219) {
			
			System.out.println("Enter Withdrawl Amount");
			
			double balance=50000;
			double amount=sc.nextDouble();
			
			if(amount<=balance) {
				System.out.println("Withdral Money Successfully");
			}else {
				System.out.println("Insufficent Balance");
			}
			
		}else {
			System.out.println("Invalid Pin");
		}
		sc.close();
		 
	}

}
