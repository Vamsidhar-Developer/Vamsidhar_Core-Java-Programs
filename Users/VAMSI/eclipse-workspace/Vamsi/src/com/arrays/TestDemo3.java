package com.arrays;
import java.util.Arrays;

public class TestDemo3 {
	
	
	
	public static void main(String[] args) {
		int[]a1= {2,3,4,5,6};
		int[]a2= {3,4,5,6,0};
		int[]a3=new int[a1.length+a2.length];	
		
		for(int i=0;i<a1.length;) {
			a3[i]=a1[i];
			i++;
		}
		for(int i=0;i<a2.length;) {
			a3[a1.length+i]=a2[i];
			i++;
		}
		System.out.println(Arrays.toString(a3));
		
	}

}
