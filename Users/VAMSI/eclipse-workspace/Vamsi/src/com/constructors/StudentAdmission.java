package com.constructors;

public class StudentAdmission {
	
	int stdId;
	String stdName;
	String Course;
	
	StudentAdmission(){
		this(19);
		 
	}
	StudentAdmission(int id){
		this(id,"Vamsi");
		
	}
	StudentAdmission(int id, String name){
		this(id,name,"Java");
		
	}
	StudentAdmission(int id ,String name,String Course){
		this.stdId=id;
		this.stdName=name;
		this.Course=Course;
		
	}
	void Display() {
	 
		System.out.println("Student name is: "+stdId); 
		System.out.println("Student Name is: "+stdName); 
		System.out.println("Student Course is: "+Course); 
		
	}
 
	public static void main(String[] args) {
		
		StudentAdmission obj=new StudentAdmission();	
		obj.Display();
		
		System.out.println("-----------Constructor 2------------");
		StudentAdmission obj2=new StudentAdmission(20, "venu");
		obj2.Display();
		
		System.out.println("-----------Constructor 3------------");
		StudentAdmission obj3=new StudentAdmission(21, "Krishna");
		obj3.Display();
		
	}

}
