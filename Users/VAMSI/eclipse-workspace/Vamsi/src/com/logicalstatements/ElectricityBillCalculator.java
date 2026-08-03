package com.logicalstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		
		System.out.println("***** Welcome To Andhra Pradesh Eclectricity Bill Commission *****");
		Scanner sc=new Scanner(System.in);
	 	int bill;
		int total =0;
		int units;
		String yn;
		
		do {
			System.out.println("!!! Please Select Your Electricity Board Type !!! \n1.Domestic \n2.Commercial \n3.Industrial \n4.Exit");
			int type=sc.nextInt();
					
			switch(type) {
			case 1:
				System.out.println("*** Your Electricity Connection Type Domestic ***");
				System.out.println("Enter Total Number of Units will Consumed: ");
				units=sc.nextInt();
				bill=6*units;
				
				if(bill >= 2000) {
					total=bill-(5*bill/100);
					System.out.println("Your Total Bill is After Applying  5% discount : "+total);
				}
				else {
					System.out.println("Your Total Bill is : "+bill);
				}
				break;
			case 2:
				System.out.println("*** Your Electricity Connection Type Commercial ***");
				System.out.println("Enter Total Number of Units will Consumed: ");
				units=sc.nextInt();
				
				 bill=8*units;
				if(bill>= 2000) {
					total=bill-(5*bill/100);
					System.out.println("Your Total Bill is After Applying  5% discount : "+total);
				}
				else {
					System.out.println("Your Total Bill is : "+bill);
				}
				break;
			case 3:
				System.out.println("*** Your Electricity Connection Type Industrial ***");
				System.out.println("Enter Total Number of Units will Consumed: ");
				units=sc.nextInt();
				
				 bill=10*units;
				if(bill >= 2000) {
					total=bill-(5*bill/100);
					System.out.println("Your Total Bill is After Applying  5% discount : "+total);
				}
				else {
					System.out.println("Your Total Bill is : "+bill);
				}
				break;
			case 4:
				System.out.println("Thank You for Visiting Andhra Pradesh Electricity Portal");
				break;
				default:
					System.out.println("Please Select a Valid Option");
				
				}System.out.println("Do You Want to Continue (Y or N):");
				 yn=sc.next();
				 		 
		}while(yn.equalsIgnoreCase("Y"));
		System.out.println("Thank You for Visiting Andhra Pradesh Electricity Portal");
		sc.close();
	}

}
