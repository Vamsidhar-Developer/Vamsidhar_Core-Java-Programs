package com.oops;

public class DisplayEmployee {

	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();
		e1.setEid(18);
		e1.setEname("VamsiDhar");
		e1.setSalary(100000.00);
		e1.setPassword("Vamsi@2219");
		
		System.out.println("The  Employee Id :"+e1.getEid());
		System.out.println("The  Employee Name :"+e1.getEname());
		System.out.println("The  Employee Salary :"+e1.getSalary());
		System.out.println("The  Employee Password :"+e1.getPassword());
		

	}

}
