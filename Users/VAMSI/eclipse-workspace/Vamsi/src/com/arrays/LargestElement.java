package com.arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int num=sc.nextInt();
		 int[] array=new int[num];
		 
		 System.out.println("Please Enter the values of an Array:");
		 
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();	
		 }
		 int max= array[0];
		 for(int i=0;i<array.length;i++) {
			 if (array[i]>max) {
				 max=array[i];
				 
			 }
		 
			  
		 }
		 System.out.println(max);
		 sc.close();
		 
		 
	}

}
