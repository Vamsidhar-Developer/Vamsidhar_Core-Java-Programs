package com.arrays;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int num=sc.nextInt();
		int[]array=new int[num]; 
		int sum=0;
		System.out.println("Enter attay elements: ");
		
		for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();
			 sum=sum+array[i];
		}
		double avarage=(double)sum/array.length;
		System.out.println("Avarage of the Array :"+avarage);
		sc.close();
	 
	}

}
