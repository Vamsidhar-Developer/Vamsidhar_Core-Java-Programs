package com.methods;

import java.util.Scanner;

public class FactorialDemo1 {
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter A Value :");
		int num=sc.nextInt();
		int result=factorial(num);
		System.out.println("Factorial of the given number : "+result);
		 
	}
	
	public static int factorial(int num) {
		
		int fact=1;
		for(int i=1;i<=num ;i++) {
			fact =fact*i;
		
			
		}
		return fact;
		
	}

}
