package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo11 {

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
		int rem=0;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				rem=array[i][j]%10;
				sum=sum+rem;
				array[i][j]=array[i][j]/10;
						
			}
		}
		System.out.println("Sum of the given 3 X 3 matrix is : "+sum);
		sc.close();
 		
 
	}

}
