package com.loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number =sc.nextInt();
		
		int original=number;
		int reverse =0;
		
		for(;number >0 ;) {
			
			int digit= number%10;
			reverse=reverse * 10 +digit;
			number=number/10;
			
		}
		if(original==reverse) {
			System.out.println("Given value is Palindrome ");
		}
		else {
			System.out.println("Given value is Not Palindrome ");
		}
		sc.close();
	}

}
