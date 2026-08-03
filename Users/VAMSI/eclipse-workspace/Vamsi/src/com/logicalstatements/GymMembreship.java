package com.logicalstatements;

import java.util.Scanner;

public class GymMembreship {

	public static void main(String[] args) {
		 System.out.println("******* Welcome to Cult_Fit Gym *******");
		 Scanner sc=new Scanner(System.in);
		 int mfee=1000;
		 int qfee=2500;
		 int yfee=9000;
		 int total;
		 int age;
		 String yn="";
		 do {
			 
		 System.out.println("*** Please Select Your Mode Of Payment *** \n1.Monthly (₹:1000) \n2.Quarterly (₹2500) \n3.Yearly (₹9000) \n4.Exit");
		 int mode=sc.nextInt();
		 
		 
		 switch(mode) {
		 case 1:
			 
			 System.out.println("You are Select Monthly Payment");
		 
		 System.out.println("Please Enter Your Age: ");
		 age=sc.nextInt();
		 if(age >=18 && age <=25) {
			 
			 total=mfee-(15*mfee/100);	 
			 System.out.println("Your are total bill after discount 15% off :"+total);
		 }
		 else {
			 System.out.println("Your are total bill  :"+mfee);
		 }
		 break;
		 case 2:
			 
			 System.out.println("You are Select Quartly Payment");
		 
		 System.out.println("Please Enter Your Age: ");
		 age=sc.nextInt();
		 if(age >=18 && age <=25) {
			 
			 total=qfee-(15*qfee/100);	 
			 System.out.println("Your are total bill after discount 15% off :"+total);
		 }
		 else {
			 System.out.println("Your are total bill  :"+qfee);
		 }	
		 break;
		 case 3:
			 
			 System.out.println("You are Select Yearly Payment");
		 
		 System.out.println("Please Enter Your Age: ");
		 age=sc.nextInt();
		 if(age >=18 && age <=25) {
			 
			 total=yfee-(15*yfee/100);	 
			 System.out.println("Your are total bill after discount 15% off :"+total);
		 }
		 else {
			 System.out.println("Your are total bill  :"+yfee);
		 }
		 break;
		 case 4:
			 System.out.println("Thank You for Visiting Our Cult-Fit Gym");
			 break;
		  
		 default: 
			System.out.println("Please Select a Valid Choice ");
			
		 }
		 System.out.println("Do You Want to Continue (Y or N) :");
		 yn=sc.next();
		 
		 }while(yn.equalsIgnoreCase("Y"));	 
		  System.out.println("Thank You for Visiting Our Cult-Fit Gym");
		  sc.close();
		 
	}

}
