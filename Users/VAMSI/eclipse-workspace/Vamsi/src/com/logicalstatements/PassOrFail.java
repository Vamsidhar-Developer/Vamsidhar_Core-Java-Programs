package com.logicalstatements;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks=sc.nextInt();
		
		if(marks >= 35) {
			System.out.println("----------------Congratulations-------------------");
			System.out.println("You are Passed");
			
		}else {
			System.out.println("----------------Sorry to Say This-------------------");
			System.out.println("You are Failed");
			
		}sc.close();

	}

}
