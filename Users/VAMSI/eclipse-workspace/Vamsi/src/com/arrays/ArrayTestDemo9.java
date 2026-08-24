package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Size of an Array: ");
		int size=sc.nextInt();
		int[]array=new int[size];
		
		System.out.println("Enter the Elements of an Array: ");
		for(int i=0;i<array.length;i++) {
		 array[i]=sc.nextInt();
		}
		int max=array[0];
		int secondMax=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				secondMax=max;
				max=array[i];
			}
			else if(array[i]>secondMax && array[i]!=max) {
				secondMax=array[i];
				}
			}

		System.out.println(secondMax);
		sc.close();

	}

}
