package com.arrays;

import java.util.Scanner;

public class SumArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please Enter array size: ");
		int num=sc.nextInt();
		int[] array=new int[num];
		
		int sum=0;
		System.out.println("Please Enter the Elemets: ");
		for(int values:array) {
			values=sc.nextInt();
			sum=sum+values;
		}
		System.out.println(sum);
		sc.close();

	}

}
