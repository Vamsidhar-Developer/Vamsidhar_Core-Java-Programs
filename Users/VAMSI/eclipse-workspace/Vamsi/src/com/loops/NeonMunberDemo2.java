package com.loops;

import java.util.Scanner;

public class NeonMunberDemo2 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a value: ");
		int n=sc.nextInt();
		int sum=0;
		
		int square=n*n;
		System.out.println("The Square of The Given Value is :"+square);
		
		for(;square > 0;){
			
			int digit=square % 10;

			sum=sum+digit;
			
			square=square/10;
		}	
			if(sum== n) {
				System.out.println("Given Number is Neon Number");
			}
			else{
				System.out.println("Given Number is Not a Neon Number");
			}
			
			sc.close();
					
				
	}

}
