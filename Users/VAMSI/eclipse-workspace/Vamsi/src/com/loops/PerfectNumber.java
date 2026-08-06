package com.loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter A Value To find Wheather the given NUmber is Perfect or Not: ");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++ ) {
			if(n%i ==0) {
				sum= sum +i;
		 
				} 
		}if(sum==n) {
			System.out.println("The given Number is a Perfect Number");
		
		}else {
			System.out.println("The given Number is a Not Perfect Number");
		}
		sc.close();
	}



}
