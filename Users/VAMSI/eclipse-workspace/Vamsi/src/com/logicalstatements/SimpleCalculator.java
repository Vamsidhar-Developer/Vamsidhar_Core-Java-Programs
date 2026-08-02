package com.logicalstatements;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First value: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second value: ");
		int num2=sc.nextInt();
		System.out.println("Enter Which Operation Want to Perform (+ , -, *, % ,/");
		char ch=sc.next().charAt(0);
		
		if(ch=='+') {
			int add=num1+num2;
			System.out.println("Addition of Two Numbers: "+add);
		}
		else if(ch=='-') {
			int sub=num1-num2;
			System.out.println("Subtraction of Two Numbers: "+sub);
		}
		else if(ch=='*') {
			int mul=num1*num2;
			System.out.println("Multiplication of Two Numbers: "+mul);
		}
		else if(ch=='%') {
			int mod=num1%num2;
			System.out.println("Modulus of Two Numbers: "+mod);
		}
		else if(ch=='/') {
			if(num2 !=0)
			{
			int div=num1/num2;
			System.out.println("Division of Two Numbers: "+div);
		}else {
			System.out.println("Division with Zero is Invalid");
			
		}
	}		
		else {
			System.out.println("Invalid Operator");
		}
		sc.close();	

	}

}
