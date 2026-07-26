package com.methods;

import java.util.Scanner;

public class EmployeeDetails {
	
	void SalarySlip(String empName,double salary) {
		
		
		System.out.println("The Employee Name is : "+empName);
		System.out.println("Employee Salary is: "+salary);
		double hra=(salary*20)/100;
		System.out.println("HRA of the Employee is: "+hra);
		double da=(salary*10)/100;
		System.out.println("DA of the Employee is: "+da);
		double gross=(salary+hra+da);
		System.out.println("Gross salary of Employee is: "+gross);
	}
	
		void main() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Name: ");
		String name=sc.next();
		System.out.println("Enter the Employee Salary: ");
		double salary=sc.nextDouble();
		SalarySlip(name,salary);
		
		 
	}

}
