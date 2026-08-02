package com.Operators;

import java.util.Scanner;

public class TernaryTestDemo2 {
	
	 int number;
	
	public static void main(String []args) {
		
		 
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter a Number:");
		int number=sc.nextInt();
		
		String result=(number>=0)?"Positive Value":"Negative Value";
		
		System.out.println("Given Number: "+result);
		
		
		
	}

}
