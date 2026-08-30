package com.basicjava;

public class Employee {
	
	int id=1001;
	String name="Vamsi";
	double salary=100000.00;

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		System.out.println("Employee Id: "+e1.id);
		System.out.println("Employee Name: "+e1.name);
		System.out.println("Employee Salary: "+e1.salary);
 
	}

}
