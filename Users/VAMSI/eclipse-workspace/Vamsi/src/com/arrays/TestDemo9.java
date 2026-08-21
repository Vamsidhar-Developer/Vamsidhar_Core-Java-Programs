package com.arrays;

public class TestDemo9 {

	public static void main(String[] args) {
		 
		int[] a= {2,5,9,0,-9,-4,0,-4,7};
		
		int[] positive=new int[a.length];
		int[] negitive=new int[a.length];
		int[] zero=new int[a.length];
		
		int p=0,n=0,z=0;
		
		for(int i=0;i< a.length;i++) {
			if(a[i] >0) {
				positive[p]=a[i];
				p++;
			}
			else if(a[i]<0) {
				negitive[n]=a[i];
				n++;
			}
			else {
				zero[i]=a[z];
				z++;
			}
		}
		System.out.println("Positive Values Array");
		for(int i=0;i<p;i++) {
			System.out.print(positive[i]+ " ");
		}
		System.out.println("\nNegitive Values Array");
		for(int i=0;i<n;i++) {
			System.out.print(negitive[i]+" ");
		}
		System.out.println("\nZero Array");
		for(int i=0;i<=z;i++) {
			System.out.print(zero[i]+" ");
		}
		

	}

}
