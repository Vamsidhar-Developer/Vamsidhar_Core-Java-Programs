package com.arrays;

import java.util.Scanner;

public class ArrayTestDemo7 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter the size of an Array: ");
		 int size=sc.nextInt();
		 int[] array=new int[size];
		 
		 System.out.println("Please Enter the Elements of an Array: ");
		 for(int i=0;i<array.length;i++) {
			 array[i]=sc.nextInt();
		 }
		 int positive=0;
		 int negitive=0;
		 int zero=0;
		 for(int i=0;i<array.length;i++) {
			 if(array[i] >0) {
				 positive++;
 			 }
			 else if(array[i]<0) {
				 negitive++;
 			 }
			 else {
				 zero++;
			 }		 
		 }
		 System.out.println("Positive Values: "+positive);
		 System.out.println("Negitive Values: "+negitive);
		 System.out.println("Zero Values: "+zero);	
		 sc.close();
	}

}
