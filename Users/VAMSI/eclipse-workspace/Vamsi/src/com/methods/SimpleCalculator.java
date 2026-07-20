package com.methods;

import java.util.Scanner;

public class SimpleCalculator {
	
	void add(int a,int b) {
		int add=(a+b);
		System.out.println("Addition of Two Numbers is: "+add);
	}
	void sub(int a,int b) {
		int add=(a-b);
		System.out.println("Subtraction of Two Numbers is: "+add);
	}
	void mul(int a,int b) {
		int add=(a*b);
		System.out.println("Multiplication of Two Numbers is: "+add);
	}
	void div(int a,int b) {
		int add=(a/b);
		System.out.println("Division of Two Numbers is: "+add);
	}

	public static void main(String[] args) {
		
		SimpleCalculator obj=new SimpleCalculator();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value: ");
		int value1=sc.nextInt();
		System.out.println("Enter Second Value: ");
		int value2=sc.nextInt();
		obj.add(value1,value2);
		obj.sub(value1,value2);
		obj.mul(value1,value2);
		obj.div(value1,value2);
		
		
	}

}
