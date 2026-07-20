package com.methods;

import java.util.Scanner;

public class Problem5 {
	
	char CalculatePercentage(int marks){
		
		if(marks<0||marks>0) {
			return 'X';
		}
			
		
	    else if(marks>=90) {
			return'A';
		}
		else if(marks>=80){
			return 'B';
			
		}else if(marks>=70){
			return 'C';
			
		}else if(marks>=60) {
			return'D';
			
		}else {
			return'F';
		}
		 
	}

	 void main() {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks=sc.nextInt();
		char grade=CalculatePercentage(marks);
		if (marks=='X') {
			System.out.println("Invalid--------Please marks in range 0 - 100");
		}
		else {
		System.out.println("Grade: "+grade);
		 
		}sc.close();
	}

}
 