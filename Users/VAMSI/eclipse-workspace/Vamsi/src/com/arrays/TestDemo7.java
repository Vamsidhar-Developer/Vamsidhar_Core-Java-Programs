package com.arrays;

import java.util.Arrays;

public class TestDemo7 {

	public static void main(String[] args) {
		 
		int[]a1= {5,2,4,3,12};
		int[]a2= {10,3,2,4,6,4,4,6};
		
		int max=Math.max(a1.length,a2.length);
		int[]a3=new int [max];
		
		 for(int i=0;i<max;i++) {
			 
			 if(i<a1.length && i<a2.length) {
				 a3[i]=a1[i]+a2[i];
			 }
			 else if(i<a1.length) {
				 a3[i]=a1[i];
			 }
			 else {
				 a3[i]=a2[i];
			 } 
		 }
		 System.out.println(Arrays.toString(a3));
		
	}

}
