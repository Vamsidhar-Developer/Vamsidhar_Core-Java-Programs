package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo21 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the size of an Array: ");
			int size=sc.nextInt();
			
			int[] array=new int[size];
			
			System.out.println("Please Enter the Elements into an Array: ");
			for(int i=0;i<array.length;i++) {
				array[i]=sc.nextInt();
			}
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
			
			System.out.println("Please Enter the size of an Array: ");
			int size2=sc.nextInt();
			
			int[] array2=new int[size2];
			
			System.out.println("Please Enter the Elements into an Array: ");
			for(int i=0;i<array2.length;i++) {
				array2[i]=sc.nextInt();
			}
			for(int i=0;i<array2.length;i++) {
				System.out.print(array2[i]+" ");
			}
			if(size == size2) {
			    for(int i=0; i<array.length; i++) {
			        if(array[i] == array2[i]) {
			            System.out.println(array[i] + " and " + array2[i] + " are equal");
			        } else {
			            System.out.println(array[i] + " and " + array2[i] + " are not equal");
			        }
			    }
			} else {
			    System.out.println("Arrays are not equal");
			}
		sc.close();			 
			
	}

}
