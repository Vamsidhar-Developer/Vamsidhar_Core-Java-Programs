package com.logicalstatements;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Enter a Positive Integer");
		}else if(num>=0 && num <=9) {
			System.out.println("Given Number  has One digit");
		}else if(num>=10 && num <=99) {
			System.out.println("Given Number  has Two digits");
		}else if(num>=100 && num <=999) {
			System.out.println("Given Number  has Three digits");
		}else {
			System.out.println("Given Number  has More Than digits");
		}
		sc.close();
		

	}

}
