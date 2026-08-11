package com.loops;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter How Many Number of Series You Want : ");
		int num=sc.nextInt();
		fibonacciSeries(num);	
			sc.close();	
	}
	static void fibonacciSeries(int num) {
		int n1=0;
		int n2=1;
		int n3=0; 
		
		System.out.println(+n1 +" "+n2 +" ");
		for(int i=1;i<=num -2;i++) {
			n3=n1+n2;
			System.out.print(n3 +" ");	
		n1=n2;
		n2=n3;
		}
		
	}

}
