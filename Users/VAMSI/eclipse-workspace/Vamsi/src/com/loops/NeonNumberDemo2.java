package com.loops;

import java.util.Scanner;

public class NeonNumberDemo2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter a value: ");
		 int num=sc.nextInt();
		 int square=num*num;
		 int sum=0;
		 System.out.println("Square value of the given  number is : "+square);
		 
		 for(;square > 0;square=square/10) {
			 int digit=square % 10;
			 sum=sum+digit;
			   	 
		 }
		 if(num==sum) {
			 System.out.println("Is Neon");
		 }else {
		 System.out.println("Is Not Neon");
		 }
		 sc.close();
	}
	

}
