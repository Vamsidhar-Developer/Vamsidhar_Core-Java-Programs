package com.constructors;

import java.util.Scanner;

public class StudentDetails {
	
	String stdName;
	int rollNo;
	double tMarks;
	
	StudentDetails(String name,int roll,double total){
		
		this.stdName=name;
		this.rollNo=roll;
		tMarks=total;
			
	}
	void Display() {
		
		double avg=tMarks/5;
		
		System.out.println("Student Name: "+stdName);
		System.out.println("Student Roll No: "+rollNo);
		System.out.println("Student Total Marks: "+tMarks);
		System.out.println("Student Total Marks Average: "+avg);
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( "Enter Student Name: ");
		String name=sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter Roll Number: ");
		int ro=sc.nextInt();
		
		System.out.println("Enter Total Marks: ");
		double tm=sc.nextDouble();
		
		StudentDetails obj=new StudentDetails(name,ro,tm);
		obj.Display();
		
		
		
		
		
	}

}
