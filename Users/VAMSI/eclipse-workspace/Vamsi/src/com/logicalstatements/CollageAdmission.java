package com.logicalstatements;

import java.util.Scanner;

public class CollageAdmission {

	public static void main(String[] args) {
		
		
	System.out.println("******* Welcome to  Bharat Engineering Collage *******");
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter Your 12th Percentage :");
	double percentage=sc.nextDouble();
	
	if(percentage >=60) {
		System.out.println("Please Enter Entrance Exam Rank: ");
		
		double rank=sc.nextDouble();
		
		if(rank<=5000) {
			
	 		System.out.println("*** Congratulations ***");
	 		
			System.out.println("You are Eligible For Admission");
		}else {
			System.out.println("*** Sorry to say This ***");
			
			System.out.println("You are Not Eligible For Admission");
			
		}
	}else {
		System.out.println("Your are Not Eligible Due to Percentage");
	}
	sc.close();
	
	}

}
