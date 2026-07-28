package com.constructors;

public class StudentInfo {
	
	int rollNo;
	String stdName;
	double marks;
 

	public StudentInfo(int rollNo, String stdName, double marks) {
		 
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.marks = marks;
	}
	StudentInfo(StudentInfo s,int id,String name){
		
		this.rollNo =  id;
		this.stdName = name;
		this.marks =s.marks;
		
	}
	void addBonusMarks(double bonus) {
		
	   marks=marks+bonus;
	}
	void display() {
		
		System.out.println("Student Roll No:"+rollNo);
		System.out.println("Student Name:"+stdName);
		System.out.println("Student Marks:"+marks);
	}

	public static void main(String[] args) {
		
		System.out.println("------------Student One Details-------------");
		StudentInfo obj1=new StudentInfo(101,"Vamshi",300);
		obj1.display();
		
		System.out.println("------------Student Two Details-------------");
		StudentInfo obj2=new StudentInfo(obj1,102,"Amitab");
		obj2.addBonusMarks(25);
		obj2.display();
		 
	}

}
