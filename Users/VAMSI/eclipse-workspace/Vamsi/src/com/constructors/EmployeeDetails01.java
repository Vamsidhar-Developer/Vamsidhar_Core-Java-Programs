package com.constructors;

import java.util.Scanner;

public class EmployeeDetails01 {
	int EmpId;
	String EmpName;
	String EmpDept;
	double salary;
	
	EmployeeDetails01(){
		this(0);		
	}
	EmployeeDetails01(int id){
		this(id,"");
		
	}
	EmployeeDetails01(int id,String name){
		this(id,name,"");
		
	}
	EmployeeDetails01(int id,String name,String dept){
		this(id,name,dept,0);
		
	}
	EmployeeDetails01(int id,String name,String dept,double sal){
		this.EmpId=id;
		this.EmpName=name;
		this.EmpDept=dept;
		this.salary=sal;
		
	}
	void Display(){	
		
		double hra=(salary*20)/100;
		double da=(salary*10)/100;
		double pf=(salary*12)/100;
		double net=(salary+hra+da)-pf;
		
		System.out.println("Employee Id: "+EmpId);
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee Dept: "+EmpDept);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee HRA: "+hra);
		System.out.println("Employee DA: "+da);
		System.out.println("Employee PF: "+pf);
		System.out.println("Employee Net Salary: "+net);
		
	}
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String name=sc.next();
		
		System.out.println("Enter Employee Department: ");
		String dept=sc.next();
		
		System.out.println("Enter Employee Salary: ");
		double sal=sc.nextDouble();
		
		EmployeeDetails01 obj=new EmployeeDetails01(id,name,dept,sal);
		
		obj.Display();
		

	}
	 

}
