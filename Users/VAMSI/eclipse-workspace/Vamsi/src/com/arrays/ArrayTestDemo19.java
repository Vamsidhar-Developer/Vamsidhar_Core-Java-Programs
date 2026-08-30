package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number of columns: ");
		int columns=sc.nextInt();
		System.out.println("Please Enter the number of Rows: ");
		int rows=sc.nextInt();
		
		int[][]array=new int[rows][columns];
		
		System.out.println("Please Enter the Elements For Matrix: ");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("***Original Matrix***");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
 		}
		System.out.println("***Transpose Matrix***");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
 
	}

}
