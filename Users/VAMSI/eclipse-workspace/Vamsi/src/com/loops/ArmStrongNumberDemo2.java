package com.loops;

import java.util.Scanner;

public class ArmStrongNumberDemo2 {
	
	static boolean isArmStrong(int num) {
		int temp=num;
		int ori=num;
		int count=0;
		int rem=0;
		int sum=0;
		while(ori >0) {
			count ++;
			ori=ori/10;
		}
		while(num>0){
			 rem=num % 10;
			 num=num/10;
			 sum=sum+(int)Math.pow(rem, count);	
			 
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


		 sc.close();


	}

}
