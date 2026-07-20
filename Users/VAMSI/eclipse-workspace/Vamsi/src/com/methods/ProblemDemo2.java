package com.methods;

import java.util.Scanner;

public class ProblemDemo2 {

	  void main() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Monthly Salary: ");
		double salary=sc.nextDouble();
		CalculateAnnualsalary(salary);
 

	}
	void CalculateAnnualsalary(double salary){
		
		double Msalary=salary*12;
		
		System.out.println("Annual Salary is: "+ Msalary);
		
		 
	 }

}
