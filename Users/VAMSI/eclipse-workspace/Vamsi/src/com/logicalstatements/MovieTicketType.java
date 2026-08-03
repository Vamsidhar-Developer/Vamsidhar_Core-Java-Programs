package com.logicalstatements;

import java.util.Scanner;

public class MovieTicketType {

	public static void main(String[] args) {
		 
		System.out.println("***** Welcome to I-Max *****");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter You Choice of Ticket \n1.Silver \n2.Gold \n3.platinum \n4.Exit: ");
		int ticket=sc.nextInt();
		int age;
		int price1=200;
		int price2=300;
		int price3=500;
		char choice;
		 
		do {
		switch(ticket) {
		case 1:
			System.out.println("Silver (Rs:200)");

			System.out.println("Please Enter Your age: ");	
			 age=sc.nextInt();
			if (age>=60) {

				price1=price1-(10*price1/100);
				System.out.println("Your Ticket Price After 10% Discount :"+price1);
				System.out.println("Thank You Visit Again");
				}
			else {
				 
				System.out.println("Your Ticket Price: "+price1);
				System.out.println("Thank You Visit Again");				
				}
			
			break;
		case 2:
			System.out.println("Gold (Rs:300)");
			System.out.println("Please Enter Your age: ");	
			age=sc.nextInt();
			if (age>=60) {
				price2=price2-(10*price2/100);
				System.out.println("Your Ticket Price After 10% Discount :"+price2);
				System.out.println("Thank You Visit Again");
			}
			else {
				 
				System.out.println("Your Ticket Price :"+price2);
				System.out.println("Thank You Visit Again");
	
				}
			break;
		case 3:
			System.out.println("Platinum (Rs:500)");
			System.out.println("Please Enter Your age: ");	
			 age=sc.nextInt();
			if (age>=60) {
				price3=price3-(10*500/100);
				System.out.println("Your Ticket Price After 10% Discount :"+price3);
				System.out.println("Thank You Visit Again :");
			}
			else {
				 
				System.out.println("Your Ticket Price"+price3);
				System.out.println("Thank You Visit Again");	 
				}
			break;
		case 4:
			System.out.println("Thank you! Visit Again.");
			break;
			
		default:
			System.out.println("Please Enter A Valid Choice");
		 			
		}System.out.println("Are you want to continue");
		   choice=sc.next().charAt(0);
		 sc.close();
	}while(choice =='Y' || choice =='y');
		System.out.println("Thank You Visit Again");
		

	}

}
