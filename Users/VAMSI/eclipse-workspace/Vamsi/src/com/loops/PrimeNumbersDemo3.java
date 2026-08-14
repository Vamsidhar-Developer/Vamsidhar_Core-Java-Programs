package com.loops;

import java.util.Scanner;

public class PrimeNumbersDemo3 {
	
	static boolean  primeNumber(int num) {
	 if(num ==0 || num ==1) {
		 return false;
		 
	 }for(int i=2;i<=num/2 ;i++) {
		 if (num % i==0) {
			 return false;
		 }
	 }
			
	 
	 return true;
	}
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a How many Prime Numbers Do you want to Print: ");
		int n=sc.nextInt();
		  
		int count=0;
		int num=2;
		while(count<n) {
			if(primeNumber(num)) {
				System.out.print(num+ " ");
				count ++;
			}
			num ++;
		}
		sc.close();
		
	}

}
