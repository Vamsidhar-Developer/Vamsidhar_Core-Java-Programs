package com.loops;

import java.util.Scanner;

public class ReverseOfNumber {
	
	static int reverseOfNumber(int num) {
		int rev=0;
		int rem=0;
	while(num >0) {	
		rem=num%10;
		num=num/10;
		rev=rev *10 +rem;
	}
	return rev;
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a Value :");
		 int num=sc.nextInt();
		 
		 int rev=reverseOfNumber(num);
		 System.out.println("Reverse of Number is: "+rev);
		 sc.close();

	}

}
