package com.loops;

import java.util.Scanner;

public class PerfectNumberDemo1 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Value: ");
		int num=sc.nextInt();
		int sum=0;

		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				System.out.print(i+ " ");
				sum=sum+i;
			}	
		}	
		if(sum==num) {
 			System.out.println("Given Number is Perfect");
		}else {	
			System.out.println("Given Number is Not Perfect");
		}

		sc.close();

	}

}
