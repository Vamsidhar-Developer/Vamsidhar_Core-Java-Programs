package com.arrays;

import java.util.Scanner;

public class AvarageOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Size of an Array: ");
		int num=sc.nextInt();
		int[] array=new int[num];
		
		int sum=0;
		System.out.println("Please Enter the Array: ");
		for(int values:array) {
			 values=sc.nextInt();
			 sum=sum+values;
		}
		double avarage=(double) sum/num;
		System.out.println("Average of the Array :"+avarage);
		sc.close();
		 
		
	}

}
