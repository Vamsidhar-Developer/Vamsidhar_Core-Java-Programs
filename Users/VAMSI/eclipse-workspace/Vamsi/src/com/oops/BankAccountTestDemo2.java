package com.oops;

import java.util.Scanner;

public class BankAccountTestDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BankAccount b1=new BankAccount();
		
		b1.setAccountNumber(987654321012l);
		b1.setHolderName("Vamsidhar");
		b1.setBalance(5000.00);
		
		System.out.println("Account Number : "+b1.getAccountNumber());
		System.out.println("Account Holder Name : "+b1.getHolderName());
		System.out.println("Account Balance: "+b1.getBalance());

		
		char userChoice;
		do {
			System.out.println("Please Select your Choice");
			System.out.println("\n1.Deposit \n2.Withdraw \n3.Exit");
			int choice=sc.nextInt();
			
		switch(choice) {
		case 1:
			System.out.println("Please Enter the Deposit Amount: ");
			double amount=sc.nextDouble();
			b1.deposit(amount);
			break;
		
		case 2:
			System.out.println("Please Enter the Withdraw Amount: ");
			double amount1=sc.nextDouble();
			b1.withdraw(amount1);
			break;
		case 3:
			System.out.println("Thank You Visit Again !!!");
			break;
			
		default:
			System.out.println("Invalid Choice"); 
			
		 
		}		
				System.out.println("Do you Want to continue (Y or N) ");
				 userChoice=sc.next().charAt(0);
			
		}
			while(userChoice =='Y' || userChoice =='y');
			
			System.out.println("***Thank You Visit Again***");
				
	}

}
