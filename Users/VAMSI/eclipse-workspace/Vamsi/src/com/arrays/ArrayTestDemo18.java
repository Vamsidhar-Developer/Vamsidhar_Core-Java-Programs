package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo18 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Size of an Array: ");
		int size=sc.nextInt();
		
		int[]array=new int[size];
		
		System.out.println("Please Enter the Elements for an Array");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
 		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nLeader Elements:");
		int leader=array[array.length-1];
		 System.out.print(leader+" ");

		 for(int i=array.length-2;i>=0;i--) {
				 if(array[i]> leader) {
					 leader=array[i];
				 System.out.print(leader+" ");
				 }
			 }
	
		sc.close();
		
	}

}
