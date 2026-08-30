package com.basicjava;

public class Student {
	
	int age;
	String name;
	double marks;
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		s1.age=22;
		s2.age=23;
		s1.name="vamsi";
		s2.name="Venu";
		s1.marks=99;
		s2.marks=98;
		
		System.out.println("*****student 1 Details*****");
		System.out.println("student Age: "+s1.age);
		System.out.println("student Name: "+s1.name);
		System.out.println("student marks: "+s1.marks);
		
		System.out.println("*****student 2 Details*****");
		System.out.println("student Age: "+s2.age);
		System.out.println("student Name: "+s2.name);
		System.out.println("student marks: "+s2.marks);
					
	}
	
}
