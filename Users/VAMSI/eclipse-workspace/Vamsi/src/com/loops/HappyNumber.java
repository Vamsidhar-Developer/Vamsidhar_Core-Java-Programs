package com.loops;

import java.util.Scanner;

public class HappyNumber {
	static boolean isHappyNumber(int num){
		int rem=0;
		while (num>9) {
		int	sum=0;
				
			while(num>0) {
				rem=num%10;
				num=num/10;
				sum=sum+(rem*rem);
			}
			num=sum;
		}
		return num==1;
	}
	
	

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Value: ");
		int num=sc.nextInt();
		if(isHappyNumber(num)) {
			System.out.println("Given Number is a Happy Number");
		}else {
			System.out.println("Given Number is Not a Happy Number");

		}
		

	}

}
