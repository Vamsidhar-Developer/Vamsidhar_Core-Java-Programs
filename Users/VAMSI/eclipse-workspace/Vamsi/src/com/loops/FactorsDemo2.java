package com.loops;

import java.util.Scanner;

public class FactorsDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter A Value: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n % i==0) {
				System.out.println("Factore of the given number is: "+i);
			}
		}
		
		sc.close();
	}

}
