package com.Operators;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter Operator: ");
		char ch=sc.next().charAt(0);
		
		double calculation=(ch=='+')?num1+num2:num1-num2;
		System.out.println("Calculation Result: "+calculation) ;

		sc.close();
	}

}
