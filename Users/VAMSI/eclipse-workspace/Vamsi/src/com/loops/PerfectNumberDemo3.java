package com.loops;

public class PerfectNumberDemo3 {
	
	static  boolean isPerfect(int num) {
		int sum=0;
		for(int i=1 ;i<=num/2;i++) {
			if (num % i==0) {
				sum=sum+i;
			}
		}
		return sum==num;
 
	}
	public static void main(String[] args) {
		 
		for(int i=1;i<=100;i++) {
			if(isPerfect(i)) {
				System.out.print(i +" ");
			}
		}
		 
		}
		
	}


