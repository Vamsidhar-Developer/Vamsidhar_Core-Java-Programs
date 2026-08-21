package com.arrays;

import java.util.Arrays;

public class ArrayTestDemo1 {

	public static void main(String[] args) {
		 
		int[] array= {10,20,30,40,50,};
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		for(int values:array) {
			System.out.print(values+" ");
		}
		
		
		System.out.println(Arrays.toString(array));
	}

}
