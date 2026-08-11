package com.loops;

import java.util.Scanner;

public class SumDigits {
	
	static int SumOfDigits(int num) {
		int sum=0;
		int rem=0;
		while(num>0) {
			rem=num %10;
			num=num/10;
			sum=sum+rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a Value: ");
		int num=sc.nextInt();
		
		int sum=SumOfDigits(num);
		System.out.println("Sum of Given Value :"+sum);
		sc.close();

	}

}
