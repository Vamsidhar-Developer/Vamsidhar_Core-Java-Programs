package com.oops;

import java.util.Scanner;

public class Student implements StudentGrade {
	
	@Override 
	public void calculateGrade(int marks){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter Your Marks: ");
		 marks=sc.nextInt();	
		
		if(marks >0 && marks >100) {
			System.out.println("Please Enter the valid marks !!!");
		}
		else if(marks >=90 ) {
			System.out.println("Grade-A");
		}
		else if(marks >=75) {
			System.out.println("Grade-B");
		}
		else if(marks >=60) {
			System.out.println("Grade-C");
		}
		else if(marks >=45) {
			System.out.println("Grade-D");
		}
		else if(marks >=35) {
			System.out.println("Grade-E");
		}
		else {
			System.out.println("You are Fail in Exam");
		}	
		
	}
	

	public static void main(String[] args) {
		
		 

	}

}
