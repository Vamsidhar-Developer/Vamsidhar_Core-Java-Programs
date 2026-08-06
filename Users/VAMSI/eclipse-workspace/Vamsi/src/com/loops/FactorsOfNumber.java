package com.loops;

import java.util.Scanner;

public class FactorsOfNumber {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter A Number To Find Factors: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			
			if(n % i ==0) {
				System.out.println(i);
			}
			sc.close();
			
		}
	}

}
