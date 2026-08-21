package com.arrays;

import java.util.Scanner;

public class ReadingAnArray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int num=sc.nextInt();
		 int[]array=new int[num];
		 
		 System.out.println("Please Enter the  Values of Array: ");
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();
			 
		 }
		 for(int value:array) {
		 System.out.println(value +" ");
		 }
		 sc.close();

	}

}
