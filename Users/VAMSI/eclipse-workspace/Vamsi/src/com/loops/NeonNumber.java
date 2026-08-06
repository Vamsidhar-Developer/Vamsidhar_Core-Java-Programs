package com.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
	 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a Number: ");
		 int n=sc.nextInt();
		 
		 int  square=n*n;
		 System.out.println("Square of the Given Number: "+square);
		 
		 int sum=0;
		 while(square >0) {
			 int digit=square%10;
			 sum=sum+digit;
			 square=square/10;
		 }
		 if(sum==n ) {
			 System.out.println("Given Number is Neon Number");
		 }
		 else {
			 System.out.println("Given Number is not Neon Number");
		 
		 }
		 sc.close();
	}


}
