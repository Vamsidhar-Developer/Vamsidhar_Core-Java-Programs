package com.arrays;

import java.util.Scanner;

public class SumofElements {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the Array Length: ");
		 int num=sc.nextInt();
		 int[] array=new int[num];
		 int sum=0;
		 
		 System.out.println("Please Enter Array Elements: ");
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();
			 sum=sum+array[i];
			 
		 }
		 System.out.println("Sum of the Given Array :"+sum);
		 sc.close();
		 

	}

}
