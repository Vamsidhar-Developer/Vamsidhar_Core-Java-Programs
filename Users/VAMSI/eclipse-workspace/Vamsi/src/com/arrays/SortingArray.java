package com.arrays;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		 
		int[] array= {98,27,33,54,59,76};
		int temp=0;
		int count=0;
		int count1=0;
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<array.length-1-i;j++) {
				
				if(array[j]>array[j+1]) {
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				flag =true;
				}	
				count++;
			}
			count1++;
			if(!flag) {
				break;
			}
			System.out.println();
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));
		System.out.println(count1);
		System.out.println(count);
		
		

	}

}
