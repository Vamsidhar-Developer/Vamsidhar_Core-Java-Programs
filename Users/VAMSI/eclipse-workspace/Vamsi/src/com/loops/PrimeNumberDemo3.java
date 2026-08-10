package com.loops;

import java.util.Scanner;

public class PrimeNumberDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Value :");
		int num = sc.nextInt();
		
	 
			if(isPrime(num)) {
				System.out.println("Is Prime");
			}else {
				System.out.println("Is Not Prime");
			}
			sc.close();	
		}

	
	static boolean isPrime(int num) {
		if (num <=1) {
			return false;
		}
		for (int i=2;i<=num /2;i++) {
			if(num % i ==0) {
				return false;
			}
		}

		return true;
	}
	
}
