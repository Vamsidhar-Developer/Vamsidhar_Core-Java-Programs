package com.logicalstatements;

import java.util.Scanner;

public class MainTestDemo2 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Given Number is Negitive");
		}else if(num>0) {
			System.out.println("Given Number is Positive");
		}else {
			System.out.println("Given Number is Zero");
		}
		sc.close();

	}

}
