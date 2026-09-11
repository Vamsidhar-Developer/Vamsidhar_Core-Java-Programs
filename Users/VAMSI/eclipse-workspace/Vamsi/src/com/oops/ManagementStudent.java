package com.oops;

import java.util.Scanner;

public class ManagementStudent extends Student {

	public void calculateGrade(int marks){


		
		if(marks >0 && marks >100) {
			System.out.println("Please Enter the valid marks !!!");
		}
		else if(marks >=85) {
			System.out.println("Grade-A");
		}
		else if(marks >=70) {
			System.out.println("Grade-B");
		}
		else if(marks >=55) {
			System.out.println("Grade-C");
		}
		else if(marks >=40) {
			System.out.println("Grade-D");
		}
		else if(marks >=30) {
			System.out.println("Grade-E");
		}
		else {
			System.out.println("You are Fail in Exam");
		}	
		
	}

	public static void main(String[] args) {
		 
		StudentGrade s3=new ManagementStudent();


	}

}
