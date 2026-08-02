package com.Operators;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		
		String leaf=(year%400==0 || year %4==0 && year%100 !=0)?"Leaf Year":"Not Leaf Year";
		
		System.out.println("Given year is :"+leaf);
		

	}

}
