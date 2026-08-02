package com.logicalstatements;

import java.util.Scanner;

public class ElectrictyBill {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter How Many Units Consumed : ");
		 double units=sc.nextDouble();
		 
		 if (units >= 0 && units <=100) {
			 
			 units =units*2;
			 System.out.println("Total Electricity Bill :"+units);
			 
		 }else if (units<=200) {
			 units =units*3;
			 System.out.println("Total Electricity Bill :"+units);
	 
		 }else {
			 units =units*5;
			 System.out.println("Total Electricity Bill :"+units);
		 }
		 sc.close();
		 
		 

	}

}
