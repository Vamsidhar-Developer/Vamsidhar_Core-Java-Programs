package com.loops;

import java.util.Scanner;

public class MagicNumber{
	
	static boolean isMagicNumber(int num) {
		int sum=0;
		int rem=0;
 		 
		while(num>9) {
			sum=0;
			while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		
			}
			num=sum;	
	}


	return num==1;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter a Value: ");
		 int num=sc.nextInt();
		 
		 if(isMagicNumber(num)) {
			 System.out.println("Given Number is a Magic Number ");
		 }else {
			 System.out.println("Given Number is Not a Magic Number ");

		 }
		 sc.close();
	}

}
