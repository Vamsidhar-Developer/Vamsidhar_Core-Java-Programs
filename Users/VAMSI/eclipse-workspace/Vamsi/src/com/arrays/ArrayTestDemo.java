package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the size of an Array: ");
		int size=sc.nextInt();
		int[] array=new int[size]; 
		
		System.out.println("Please Enter the Elements of an Array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Please Enter the number you want Search: ");
		int search=sc.nextInt();
		int count=0;
 		for(int i=0;i<array.length;i++) {
			if(array[i]== search) {
				count++;
			}	
		}
		System.out.println(search + "Number is :"+count+ "Times");
		sc.close();
	}

}
