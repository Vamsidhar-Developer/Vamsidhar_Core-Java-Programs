package com.arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of an Array: ");
		int num=sc.nextInt();
	 
		int[]array=new int[num];
	 
		
		System.out.println("Please enter the values: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				 even++;
			}else {
				odd++;
			}
		 
		}
		System.out.println("Even"+even);
		System.out.println("odd"+odd);
		sc.close();
	
 
		}
	}
	
