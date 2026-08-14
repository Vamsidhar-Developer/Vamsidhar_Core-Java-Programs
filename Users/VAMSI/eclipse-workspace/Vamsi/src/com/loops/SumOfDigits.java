package com.loops;

import java.util.Scanner;

public class SumOfDigits {
	
	static int digitCount(int num) {
		int sum=0;
		int rem=0;
		while(num >0){
			
			rem=num % 10;
			num=num/10;
			sum=sum+rem;
			
}
		return sum;
	}

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Value: ");
		int num=sc.nextInt();
		int count=digitCount(num);
		System.out.println("Sum of the given Number is :"+count);
		sc.close();

	}

}
