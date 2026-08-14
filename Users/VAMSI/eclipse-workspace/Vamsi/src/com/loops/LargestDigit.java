package com.loops;

import java.util.Scanner;

public class LargestDigit {
	static int largestDigit(int num){
		int rem=0 ;
		int max=0;
		while (num >0) {
			rem=num%10;
			if (rem > max) {
				max=rem;
			}
			num=num/10;	
		}
		return max;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("PLease Enter a Number: ");
		int num=sc.nextInt();
		
		int max=largestDigit(num);
		System.out.println("Maximum Digit of the Given Number is :"+max);
		sc.close();
	}

}
