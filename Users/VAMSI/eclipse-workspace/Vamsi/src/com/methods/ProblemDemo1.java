package com.methods;

import java.util.Scanner;

public class ProblemDemo1 {
	
	void CalculateInterest(double principle, double rate, int t){
		double interest=(principle*rate*t)/100;
		System.out.println("Interest Amount is: "+interest);
	     
		
	}

	public static void main(String[] args) {
		ProblemDemo1 obj=new  ProblemDemo1();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Interest : ");
		double r=sc.nextDouble();	
		System.out.println("Enter time: ");
		int t=sc.nextInt();	
		obj.CalculateInterest(p,r,t);
		
	    

	}

}
