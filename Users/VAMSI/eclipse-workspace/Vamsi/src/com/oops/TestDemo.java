package com.oops;

public class TestDemo {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEid(9);
		emp.setEname("Vamsidhar");
		emp.setSalary(100000.00);
		
		System.out.println("Employee Id: "+emp.getEid());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Salary: "+emp.getSalary());
		

	}

}
