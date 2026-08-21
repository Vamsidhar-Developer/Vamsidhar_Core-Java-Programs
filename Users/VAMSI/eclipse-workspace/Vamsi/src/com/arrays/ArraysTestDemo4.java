package com.arrays;

import java.util.Arrays;

public class ArraysTestDemo4 {

	public static void main(String[] args) {
		 int[]a1= {9,5,3,4,6,7};
		 int[]a2= {2,3,1,6,9,6};
		 int[]a3=new int[a1.length+a2.length];
		 int index=0;
		 
		 for(int values:a1) {
			 a3[index]=values;
			 index++;
			 
		 }
		 for(int values:a2) {
			 a3[index]=values;
			 index ++;
		 }
		 System.out.println(Arrays.toString(a3));
		 
		 
	}

}
