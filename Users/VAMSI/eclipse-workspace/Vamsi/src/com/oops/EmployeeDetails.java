package com.oops;

public class EmployeeDetails {
	
	private int id;
	private String name;
	private double salary;
	private String password;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	EmployeeDetails(){
		
	}
	
	public void setEid(int id) {
		this.id=id;
	}
	
	public int getEid() {
		return id;
	}
	public void setEname(String name) {
		this.name=name;
	}
	
	public String getEname() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
	

	 
	 

}
