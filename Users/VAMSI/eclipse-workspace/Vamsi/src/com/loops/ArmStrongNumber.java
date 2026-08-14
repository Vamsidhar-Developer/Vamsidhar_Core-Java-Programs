package com.loops;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static boolean isArmStrong(int num) {
		int temp=num;
		int rem=0;
		int sum=0;
		while(num >0) {
			rem=num%10;
			num=num/10;
			sum=sum+(rem * rem * rem);

		}
		 return sum==temp;
		
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please Enter a Number: ");
	 int num=sc.nextInt();
	 
	 if(isArmStrong(num)) {
		 System.out.println("Given Number is Arm Strong Number: ");
	 }else {
		 System.out.println("Given Number is Not Arm Strong Number: ");
	 }

	}

}
