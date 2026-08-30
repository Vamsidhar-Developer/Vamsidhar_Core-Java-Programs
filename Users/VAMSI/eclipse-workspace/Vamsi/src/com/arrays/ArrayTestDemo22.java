package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo22 {

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
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*****Output*****");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] % 2 == 0) {
					array[i][j] = 0;
				}
				else {
					array[i][j] = -1;
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}
		
		sc.close();
	}

}
