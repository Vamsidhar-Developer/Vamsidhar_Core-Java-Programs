 package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int size=sc.nextInt();
		 int[] array=new int[size];
		 
		 System.out.println("Please Enter the Elements of an Array");
		 
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();	 
		 }
		 int sum=0;
		 int avg=0;
		 for(int i=0;i<array.length;i++) {
			sum=sum+array[i]; 
			avg=sum/array.length;
		 }
		 System.out.println("Sum of an Array :"+avg);
		 sc.close();
	}

}
