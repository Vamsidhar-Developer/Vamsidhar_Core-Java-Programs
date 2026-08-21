package com.arrays;

import java.util.Arrays;

public class TestDemo5 {

	public static void main(String[] args) {
		  int[]a1= {3,7,4,9,8};
		  int[]a2= {7,7,9,5,3};
		  int[]a3=new int[a1.length ];
		 
		  for(int i=0;i<a1.length;i++) {
			  a3[i]=a1[i]+a2[i];
			  }
		  System.out.println(Arrays.toString(a3));
		  }

	}


