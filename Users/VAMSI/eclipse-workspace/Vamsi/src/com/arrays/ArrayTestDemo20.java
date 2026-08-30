package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the size of an Array: ");
		int size=sc.nextInt();
		
		int[] array=new int[size];
		int[] copyArray=new int[array.length];
		
		System.out.println("Please Enter the Elements into an Array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			copyArray[i]=array[i];
			 
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");	 
	 
		}
          System.out.println();
		for(int i=0;i<array.length;i++) {
			System.out.print(copyArray[i]+" ");
			
		}
		sc.close();
 
	}

}
