package com.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter A Value: ");
		int n=sc.nextInt();
		
		for(int i=1;i <=n;i++) {
		fact=fact*i;		
		}
		System.out.println("Factorial value of the given Number is: "+fact);
		sc.close();
		
	}

}
