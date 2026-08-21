package com.arrays;

import java.util.Scanner;

public class AutoMorphicNumber {
	
	static boolean autoMorphic(int num) {
		int square=num*num;
		 
		int temp=num;
		int count=0;
		System.out.println("Square Value of the given Number: "+square);
		while(temp>0) {
			count ++;
			temp=temp/10;		
		}
		int lastDigit=num*num% (int)Math.powExact(10, count);
		System.out.println(lastDigit);
		
		if(lastDigit==num) {
		    	System.out.println("Given Number is AutoMorphic");
		    	 	}else {
		    	    	System.out.println("Given Number is Not AutoMorphic");

		    	 	}
	    return true;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter a Value: ");
		 int num=sc.nextInt();
		 autoMorphic(num);
		 sc.close();
		 
		 
		 
	}

}
