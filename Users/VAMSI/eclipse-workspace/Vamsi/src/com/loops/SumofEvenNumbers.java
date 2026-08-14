package com.loops;

import java.util.Scanner;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter A Value: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i % 2==0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
			}
		System.out.println();
			System.out.println("Sum of First 100 Even Numbers :"+sum); 
	 
		sc.close();
	 
	}

}
