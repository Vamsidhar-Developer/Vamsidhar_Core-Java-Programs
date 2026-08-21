package com.arrays;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int num=sc.nextInt();
		 int[] array=new int[num];
		 
		 System.out.println("Please Enter the values of an Array:");
		 
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();	
		 }
		 int min=array[0];
		 for(int i=0;i<array.length;i++) {
			 if (array[i]<min ) {
				 min=array[i];
				 
			 }	 
			  
		 }
		 System.out.println(min); 
		 sc.close();
		 
	}

}
