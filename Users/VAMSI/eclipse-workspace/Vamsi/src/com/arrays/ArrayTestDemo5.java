package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int size=sc.nextInt();
		 int[] array=new int[size];
		 
		 System.out.println("Please Enter the Elements of an Array: ");
		 
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();
		 }
		 System.out.println("***Even Numbers in a given Array***");
		 for(int i=0;i<array.length;i++) {
			 if(array[i]%2==0) {
				 System.out.print(array[i]+" ");
			 }
		 }
		 System.out.println("\n***Odd Numbers in a given Array***");
		 for(int i=0;i<array.length;i++) {
			 if(array[i]%2!=0) {
				 System.out.print(array[i]+" ");
			 }
		 }
		 sc.close();
	}

}
