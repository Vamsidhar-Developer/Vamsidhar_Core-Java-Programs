package com.constructors;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	Employee(int empId,String empName,double salary){
		
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}
	Employee(Employee e,String name){
		
		this.empId=e.empId;
		this.empName=name;
		this.salary=e.salary;
		
	}
	void incrementsal(double amount) {
		
		salary=salary+amount;
		
	}
	void display() {
		
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+salary);
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("------Employee One Details-------");
		Employee obj1=new Employee(101,"Krishna",50000.0);
		obj1.display();
		
	    System.out.println("------Employee Two Details--------");
		Employee obj2=new Employee(obj1,"Ravi");
		 
		obj2.incrementsal(10000);
		obj2.display();
		 

	}

}
