package com.logicalstatements;

import java.util.Scanner;

public class LeafYearDemo {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		if(year % 400 ==0 || year % 4 ==0 && year % 100 !=0 ) {
			System.out.println("Give Year is Leaf Year");
		}else {
			System.out.println("Given Year is Not Leaf Year");

		}sc.close();
			 
	}

}
