 
package com.loops;

import java.util.Scanner;

public class PrimeNumberDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How Many Prime numbers Do You Want ::");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (isPrime(i)) {
				System.out.println(i);
			}
		}

		sc.close();
	}

	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
 
