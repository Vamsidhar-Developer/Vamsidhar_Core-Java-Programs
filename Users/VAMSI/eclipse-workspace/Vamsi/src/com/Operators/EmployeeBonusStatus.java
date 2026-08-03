package com.Operators;

import java.util.Scanner;

public class EmployeeBonusStatus {

	public static void main(String[] args) {
		
		System.out.println("***** Welcome to Employee Bonus Portal *****");
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Performance Rat3ing (0 - 5)");
		int rating=sc.nextInt();
		
		String bonus=(rating >= 4 && rating <=5 )?"You are eligible for Bonus":"You are not eligible for Bonus";
		
		System.out.println("Eligible Status: "+bonus);
		sc.close();

	}

}
