package com.Operators;

import java.util.Scanner;

public class SmallestValue {
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Three Values:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			int smallest=(a<b)?(a<c)?a:c :(b<c)?b:c;
			
			System.out.println("Small Number in given Valus:"+smallest);
			
			
			 

		}

	}
