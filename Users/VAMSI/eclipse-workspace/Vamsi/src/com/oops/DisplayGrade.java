package com.oops;

import java.util.Scanner;

public class DisplayGrade  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Result Portal");
		int marks; 
		
		StudentGrade s1=new EngineeringStudent();
		StudentGrade s2=new MedicalStudent();
		StudentGrade s3=new ManagementStudent();
		
		System.out.println("Please Enter your choice: \n1.Engineering Student\n2.MedicalStudent\n3.ManagementStudent"); 
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("You Choose Engineering Student Grade Checking Portal");
			 System.out.println("Please Enter Your Marks: ");
			marks=sc.nextInt();
			s1.calculateGrade(marks);
			break;
		case 2:
			System.out.println("You Choose Medical Student Grade Checking Portal");
			System.out.println("Please Enter Your Marks: ");
			marks=sc.nextInt();
			s2.calculateGrade(marks);
			break;
		case 3:
			System.out.println("You Choose Management Student Grade Checking Portal");
			System.out.println("Please Enter Your Marks: ");
			marks=sc.nextInt();
			s3.calculateGrade(marks);
			break;
		default:
				System.out.println("Invalid choice");
			
		}
		sc.close();
	}

}
