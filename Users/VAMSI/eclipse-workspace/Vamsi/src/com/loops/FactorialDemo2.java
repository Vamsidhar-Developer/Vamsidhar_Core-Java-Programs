package com.loops;

import java.util.Scanner;

public class FactorialDemo2 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a value: ");
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i <= n ;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the given value: "+fact);
		sc.close();
	}

}
