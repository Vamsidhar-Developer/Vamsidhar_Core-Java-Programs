package com.logicalstatements;

import java.util.Scanner;

public class BusTicketBooking {

	public static void main(String[] args) {
		 
		System.out.println("******* Welcome to BlueBus Ticket Portal *******");
		Scanner sc=new Scanner(System.in);
		int age;
		int bus1=100;
		int bus2=180;
		int bus3=350;
		int total;
		String yn="";
		
		do {
		System.out.println("Please Select Bus  \n1.Ordinary(₹:100) \n2.Express(₹:180) \n3.Super(₹350) \n4.Exit: ");
		int bus=sc.nextInt();
		
		switch(bus) {
		case 1:
			System.out.println("You select Ordinary Bus "); 
			System.out.println("Please Enter Your Age: ");
			age=sc.nextInt();
			
			if(age >= 60) {
				total=bus1-(20*bus1/100);
				System.out.println("Your Bus Ticket Price After applied (20%) Senior Citizen discount: "+total);
			}
				else {
					System.out.println("Your Bus Ticket Price : "+bus1);
				}
			break;
		case 2:
			System.out.println("You select Express Bus ");
			System.out.println("Please Enter Your Age: ");
			age=sc.nextInt();
			
			if(age >= 60) {
				total=bus2-(20*bus2/100);
				System.out.println("Your Bus Ticket Price After applied (20%) Senior Citizen discount: "+total);
			}
				else {
					System.out.println("Your Bus Ticket Price : "+bus2);
				}
			break;
		case 3:
			System.out.println("You select Super Luxuary Bus ");
			System.out.println("Please Enter Your Age: ");
			age=sc.nextInt();
			
			if(age >= 60) {
				total=bus3-(20*bus3/100);
				System.out.println("Your Bus Ticket Price After applied (20%) Senior Citizen discount: "+total);
			}
				else {
					System.out.println("Your Bus Ticket Price : "+bus3);
				}
			break;
		case 4:
			System.out.println("Thank You Visit Again");
			break;
			default: 
				System.out.println("Please Select A Valid Option");
				
		}	System.out.println("Do you want Continue (Y or N)");
			yn=sc.next();
		
				}while(yn.equalsIgnoreCase("Y"));
		
				System.out.println("Thank You Visit Again ");
				sc.close();
				
	}

}
