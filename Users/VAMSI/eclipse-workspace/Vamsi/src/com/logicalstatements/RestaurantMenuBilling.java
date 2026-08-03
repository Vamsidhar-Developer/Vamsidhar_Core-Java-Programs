package com.logicalstatements;

import java.util.Scanner;

public class RestaurantMenuBilling {

	public static void main(String[] args) {
	 
		System.out.println("******* Welcome to Paradise Restaurant *******");
		Scanner sc=new Scanner(System.in);
		
		int quantity;
		int price1=180;
		int price2=250;
		int price3=150;
		int total;
		char yn;
		
		do {
			System.out.println("Please Enter your Order \n 1.Veg Biryani \n 2.Chicken Biryani \n 3.Fried Rice \n 4.Exit:");
			int choice=sc.nextInt();
		switch(choice) {	
		
			case 1:
				System.out.println("Veg Biryani (₹180)");
				System.out.println("Please Enter the Quantity :");
				quantity=sc.nextInt();
				total=price1*quantity;
				if(total >= 500 ) {
					total=total-(10*total/100);
					System.out.println("Your Total Bill after getting 10% off :"+total);
				}
				else {
					System.out.println("Your Total Bill is :"+total);
				}
				
				
				break;
			case 2:
				System.out.println("Chicken Biryani (₹250)");
				System.out.println("Please Enter the Quantity :");
				quantity=sc.nextInt();
				total=price2*quantity;
				if(total >= 500 ) {
					total=total-(10*total/100);
					System.out.println("Your Total Bill after getting 10% off :"+total);
				}
				else {
					System.out.println("Your Total Bill is :"+total);
				}
				break;
			case 3:
				System.out.println("Fried Rice (₹150)");
				System.out.println("Please Enter the Quantity :");
				quantity=sc.nextInt();
				total=price3*quantity;
				if(total >= 500 ) {
					total=total-(10*total/100);
					System.out.println("Your Total Bill  after getting 10% off :"+total);
				}
				else {
					System.out.println("Your Total Bill is :"+total);
				}
				break;
			case 4:
				System.out.println("Thank You Visit Again ");
				break;
				default:
				System.out.println("Please Enter a valid Choice");
		
		}System.out.println("Do you want to Continue(y or n): ");
		 yn=sc.next().charAt(0);
		sc.close();
		}while(yn == 'Y' || yn =='y') ;
		
		System.out.println("Thank You Visit Again !!!");
		
		
	} 

}
