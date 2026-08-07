package com.loops;

import java.util.Scanner;

public class RecursionDemo {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Value:");
		int num=sc.nextInt();
		int fact=1;
		System.out.println("Factorial of the given Number: "+fact(num));
		
	}
		public static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
			
		}else {
			return num * fact(num-1);
		}
		
		
	}

}
