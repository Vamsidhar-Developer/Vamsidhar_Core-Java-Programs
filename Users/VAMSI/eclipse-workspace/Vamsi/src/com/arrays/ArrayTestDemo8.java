package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please Enter the Size of an Array: ");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		System.out.println("Please Enter the Elements of an Array: ");
	 	
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
 		}
		System.out.println();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
 		}
		
		sc.close();
		
	}

}
