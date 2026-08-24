package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Size of an Array: ");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Please Enter the Elements of an Array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		 System.out.println("Even Numbers");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
			System.out.println(array[i]);		 
			}
		}
		sc.close();
	 
		
	}

}
