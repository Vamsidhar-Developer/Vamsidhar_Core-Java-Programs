package com.methods;

import java.util.Scanner;

public class ElectricityBill {
	 
	void CalculateBill(double units) {
		double cunits=units*7;
		System.out.println("Electricity Bill :"+cunits);
		
	}

	public static void main(String[] args) {
		ElectricityBill vamsi=new ElectricityBill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Units Will Consume: ");
		double units=sc.nextDouble();
		vamsi.CalculateBill(units);
		 

	}

}
