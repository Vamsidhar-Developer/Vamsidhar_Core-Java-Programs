package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number of Columns of an Array: ");
		int columns = sc.nextInt();
		System.out.println("Please Enter the Number of Rows of an Array: ");
		int rows = sc.nextInt();

		int[][] array = new int[columns][rows];

		System.out.println("Please Enter the Elements of an Array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		  System.out.println("*****Input*****");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i+=2) {
			int temp=array[i][0];
			array[i][0]=array[i][2];
			array[i][2]=temp;
			
		}
		for (int j = 0; j < array.length; j++) {
			if(j!=1) {
				array[1][j]=array[1][j]*2;
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			array[i][i]=array[i][i]*array[i][i];
		}
		
		  System.out.println("*****Output*****");
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			sc.close();
		
	}
	
}	
		
		
	
