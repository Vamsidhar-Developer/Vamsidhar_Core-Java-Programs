package com.methods;

import java.util.Scanner;

public class BankDetails02 {
	
	void CalculateInterest(double principle,double rate,int time){
		double interest=(principle*rate*time)/100;
		System.out.println("The Interest is: "+interest);
		 
	 }

	public static void main(String[] args) {
		
		BankDetails02 obj=new BankDetails02();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		double princ=sc.nextDouble();
		System.out.println("Enter Rate of Interet : ");
		double rate=sc.nextDouble();
		System.out.println("Enter Time: ");
		int time=sc.nextInt();
		obj.CalculateInterest(princ,rate,time);
		
		 

	}

}
