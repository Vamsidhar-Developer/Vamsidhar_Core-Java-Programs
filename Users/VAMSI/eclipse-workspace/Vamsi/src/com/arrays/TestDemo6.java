 package com.arrays;

import java.util.Arrays;

public class TestDemo6 {

	public static void main(String[] args) {
		  int[]a1= {3,7,4,9,8};
		  int[]a2= {7,7,9,5,3};
		  int[]a3=new int[a1.length ];
		  int index=0;
		 
		  for(int values:a1) {
			  a3[index]=values+a2[index];
			  index ++;
			  }
		  System.out.println(Arrays.toString(a3));
		  }

	}
