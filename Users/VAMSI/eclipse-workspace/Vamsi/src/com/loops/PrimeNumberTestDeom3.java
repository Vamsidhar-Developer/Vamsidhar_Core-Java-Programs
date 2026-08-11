package com.loops;

import java.util.Scanner;

public class PrimeNumberTestDeom3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Value: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				System.out.println(i);


			}

		}
		sc.close();
	}
		static boolean isPrime(int num) {
			if(num <=1) {
				return false;
			}
			for(int i=2;i<=num /2;i++) {
				if(num %i ==0) {
					return false;
				}
			}
			return true;
		}
		
}
