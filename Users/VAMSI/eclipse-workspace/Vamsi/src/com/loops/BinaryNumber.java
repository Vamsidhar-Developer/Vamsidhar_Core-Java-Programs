package com.loops;

import java.util.Scanner;

public class BinaryNumber {
	
	static void  decimalToBinary(int num) {
		
		int rem=0;
		String binVal="";
		while(num>0) {
			rem=num%2;
			num=num/2;
			binVal=rem+binVal;
		}
		System.out.println("Binary Value is :"+binVal);
		
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter a Value : ");
		 int num=sc.nextInt();
		 decimalToBinary(num);
		 sc.close();
		 

	}

}
