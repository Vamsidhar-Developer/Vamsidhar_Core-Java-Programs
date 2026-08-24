package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter How Many Columns you Want: ");
		int columns=sc.nextInt();
		System.out.println("Please Enter How Many Rows you Want: ");
		int rows=sc.nextInt();

		int[][] array= new int[columns][rows];
		System.out.println("Please Enter the Elements Of An Array: ");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=sc.nextInt();
 			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				 System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		int leftDiagonal=0;
		int rightDiagonal=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(i==j) {
				leftDiagonal=leftDiagonal+array[i][j];
				}
				if(i+j==2) {
				rightDiagonal=rightDiagonal+array[i][j];
					
				}
				sum=leftDiagonal+rightDiagonal;
			}
		}
		System.out.println("Sum of Array Diagonals: "+sum);
		sc.close();
	}

}
