package com.oops;

class Person{
	String name;
	int age;
	 
	public Person(String name, int age ) {
		super();
		this.name = name;
		this.age = age;
	 
	} 
	
}
class Student2 extends Person{
	String collageName;
 
 
public Student2(String name, int age , String collageName2) {
		super(name, age);
		this.collageName = collageName2;
	}

}

public class InheritanceTestDemo2 {
	
	public static void main(String[] args) {
		Student2 s1=new Student2("Vamsidhar",22,"PBR VITS");
		
		System.out.println("The Name Of the Person :"+s1.name);
		System.out.println("The Age of the Person: "+s1.age);
		System.out.println("The Collage Name :"+s1.collageName);
		
		
		
	}
}


