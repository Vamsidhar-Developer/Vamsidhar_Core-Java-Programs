package com.loops;

import java.util.Scanner;

public class PrimeNumberDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Value: ");
		int num=sc.nextInt();
		
		 
			if(isPrime(num)) {
				System.out.println("Given Number is Prime ");
			}
			else {
				System.out.println("Given Number is Not Prime ");

			}
		sc.close();
		

	}
		static boolean isPrime(int num) {
			
			if(num==0||num==1) {
				return false;
				
			}for(int i=2;i<=num/2;i++) {
				if(num % i==0) {
					return false;
				}
			}
				
			return true;
			
		}

}
