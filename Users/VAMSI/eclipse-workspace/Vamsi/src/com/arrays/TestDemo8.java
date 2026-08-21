package com.arrays;

public class TestDemo8 {

	public static void main(String[] args) {
		 
		int []a1= {2,5,-9,8,-7,0,5,0,-9,-6,9,-8};
		
		System.out.println("Positive Values");
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>0) {
				System.out.print(a1[i] +" ");
			}
		}
		System.out.println("\nNegitive Values");
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<0) {
				System.out.print(a1[i] +" ");
			}
		}
		System.out.println("\nZeros ");
		for(int i=0;i<a1.length;i++) {
			if(a1[i]==0) {
				System.out.print(a1[i]+" ");
			}
		}

		
				

	}

}
