package com.constructors;

import java.util.Scanner;

public class EmployeeDetails {
	
	 
		int empId;
		String empName;
		double salary;
		
		EmployeeDetails(int id,String name, double sal){
			
			this.empId=id;
			this.empName=name;
			this.salary=sal;
			
		}
		void show() {
			
			double annual=salary*12;
			
			System.out.println("Employee Id: "+empId);
			System.out.println("Employee Name: "+empName);
			System.out.println("Employee Salary: "+salary);
			System.out.println("Employee Annual Salary: "+annual);
		}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: " );
		int id=sc.nextInt();
		
		System.out.println("Enter name: " );
		String name=sc.next();
		
		System.out.println("Enter Salary: " );
		double sal=sc.nextDouble();
		
		
		EmployeeDetails obj=new EmployeeDetails(id,name,sal);
	 
		obj.show();

	}

}
