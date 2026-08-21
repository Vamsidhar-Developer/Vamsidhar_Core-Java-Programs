package com.arrays;

import java.util.Scanner;

public class SecondLargest {
	
	static void secondLargest(int num) {

		int secondLargest=-1;
		int largest=-1;
		
		while(num>0) {
			 int digit=num%10;
			 if(digit>largest) {
				 secondLargest=largest;
				 largest=digit; 
			 }
			 else if(digit >secondLargest &&digit !=largest) {
				 secondLargest=digit;
			 }
			num=num/10;
			
		}
		System.out.println("Second Largest Digit: "+secondLargest);
		
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter a Value: ");
		 int num=sc.nextInt();
		 secondLargest(num);
		 sc.close();

	}

}
