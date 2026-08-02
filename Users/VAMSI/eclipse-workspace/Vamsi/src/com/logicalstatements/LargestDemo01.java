package com.logicalstatements;

import java.util.Scanner;

public class LargestDemo01 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Value: ");
		int num2=sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("The Largest Number is: "+num1);
		}else if(num1 < num2) {
			System.out.println("The Largest Number is: "+num2);
		}else {
			System.out.println("Both Numbers are equal: ");
		}
		sc.close();

	}
	   

}
