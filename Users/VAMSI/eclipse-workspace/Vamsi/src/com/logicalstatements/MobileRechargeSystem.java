package com.logicalstatements;

import java.util.Scanner;

public class MobileRechargeSystem {

	public static void main(String[] args) {
		 
		System.out.println("******* Welcome to VS Recharge Portal *******");
		Scanner sc=new Scanner(System.in);
		String yn ="";
		int plan1=199;
		int plan2=399;
		int plan3=599;
		int totalBill;
		String member;
		  
		
		
	do {
		System.out.println("Please Select a Plan \n (₹199/-) \n (₹399) \n (₹599)  ");
	    int plan=sc.nextInt();
		 
		switch(plan) {
		case 199:
			System.out.println("Selected plan is ₹199/- ");
			
			System.out.println("Please Conform are You a Premier Member or Not (Y or N): ");
		    member=sc.next();
			if(member.equalsIgnoreCase("y")) {
			totalBill=plan1-(5*plan1/100);
			System.out.println("Your Total Recharge bill : "+totalBill);
			}
			else {
				System.out.println("Your Total Recharge bill : "+plan1);
			}
			break;

			case 399:
				System.out.println("Selected plan is ₹399/- ");
				
				System.out.println("Please Conform are You a Premier Member or Not (Y or N): ");
				member=sc.next();
				if(member.equalsIgnoreCase("y")) {
				totalBill=plan2-(5*plan2/100);
				System.out.println("Your Total Recharge bill : "+totalBill);
				}
				else {
					System.out.println("Your Total Recharge bill : "+plan2);
				}
				break;
				
			case 599:
				System.out.println("Selected plan is ₹599/- ");
				
				System.out.println("Please Conform are You a Premier Member or Not (Y or N): ");
				member=sc.next();
				if(member.equalsIgnoreCase("y")) {
				totalBill=plan3-(5*plan3/100);
				System.out.println("Your Total Recharge bill : "+totalBill);
				}
				else {
					System.out.println("Your Total Recharge bill : "+plan3);
				}
				break;
			case 4:
				System.out.println("Thank You Visit Again !!!");
				break;
				
				default:
					System.out.println("Please Select A Valid Option ");

		} 
		System.out.println("Do you want to Continue (Y or N) :");
		yn=sc.next();
		 
	}
	while(yn.equalsIgnoreCase("Y"));
		System.out.println("Thank You Visit Again !!!");
		sc.close();
	}

}
