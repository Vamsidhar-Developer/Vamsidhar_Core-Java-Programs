package com.methods;
import java.util.Scanner;

public class StudentResult {
	 
		 void main(String[] args) {
		 System.out.println("Main Method Started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Student Name: ");
		 String name=sc.next();
		 displayStudent(name);
		 System.out.println("Enter first subject marks: ");
		 int m1=sc.nextInt();
		 System.out.println("Enter subject subject marks: ");
		 int m2=sc.nextInt();
		 System.out.println("Enter third subject marks: ");
		 int m3=sc.nextInt();
		 CalculateTotal(m1,m2,m3);
		 CalculateAvarage(m1,m2,m3);
		 System.out.println("Main Method Ended");

	}
	void displayStudent(String name) {
		 
		System.out.println(" Student Name is: "+name);
				
	}
	void CalculateTotal(int m1,int m2,int m3) {
		
		int total=m1+m2+m3;
		System.out.println("Total marks: "+ total);
				
	}
	void CalculateAvarage( int m1,int m2,int m3) {
		
		int avarage=(m1+m2+m3) /3 ;
		System.out.println("Avarage marks: "+avarage);
		
	}

}
