package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo6 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int size=sc.nextInt();
		 int[] array=new int[size];
		 
		 System.out.println("Please Enter the Elements of an Array: ");
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();
		 }
		 
		 int max=array[0];
		 int min=array[0];
		 
		 for(int i=0;i<array.length;i++) {
			 if(array[i]>max) {
				 max=array[i];
 			 }
			 if(array[i]<min) {
				 min=array[i];
 			 }
			 
		 }
		 System.out.println("Maximum Value in an array is: "+max);
		 System.out.println("Minimum Value in an array is: "+min);

		 sc.close();
	}

}
