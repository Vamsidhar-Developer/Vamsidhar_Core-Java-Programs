package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Size of an Array: ");
		int size=sc.nextInt();
		int[]array=new int[size];
		
		System.out.println("Enter the Elements of an Array: ");
		for(int i=0;i<array.length;i++) {
		 array[i]=sc.nextInt();
		}
		int min=array[0];
		int secondMin= Integer.MAX_VALUE;
		
		for(int i=1;i<array.length;i++){
			if(array[i]<min) {
				secondMin=min;
				min=array[i];
			}	
			else if(array[i] <secondMin && array[i] !=min) {
				secondMin=array[i];
			}
		}
		System.out.println(secondMin);
		sc.close();
	}
	

}
