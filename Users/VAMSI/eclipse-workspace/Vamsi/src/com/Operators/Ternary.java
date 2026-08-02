package com.Operators;

import java.util.Scanner;

public class Ternary {
	
	int  marks;

	public static void main(String[] args) {
		
		 
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Marks: ");
		int marks=sc.nextInt();
		
	
		String grade = (marks >=90 && marks <=100)? "Grade A": (marks>=75)?"Grade B":(marks>=60)?"Grade C":(marks>=45)?"Grade D":"Fail";
		 
		System.out.println("Your Grade is:"+grade);
	}
	

}
