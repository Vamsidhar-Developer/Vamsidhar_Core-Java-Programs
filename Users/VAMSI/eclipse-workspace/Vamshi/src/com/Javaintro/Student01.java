package com.Javaintro;

public class Student01 {
	
	static String SchName;
	static int SchId;
	int StdId;
	String StdName;
	
	static  {
		
		System.out.println("Static Block Executed");
		
		SchId=524223;
		SchName="Prathibha Public School";
		
	}
	{
		System.out.println("Instance Block Executed");
	}
	
	void Display(){
		
		System.out.println("Student Id: "+StdId);
		System.out.println("Student Name: "+StdName);
		System.out.println("Student School Id: "+ SchId);
		System.out.println("Student School Name: "+ 	SchName);
	 
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method Executed");
		
		
		Student01 v1=new Student01();
		v1.StdId=1001;
		v1.StdName="Vamshidhar Reddy";
		System.out.println("----------First Student Details-----------");
		v1.Display();
		
		Student01 s1=new Student01();
		s1.StdId=1002;
		s1.StdName="Sathvika Reddy";
		System.out.println("----------Second Student Details-----------");
		s1.Display();
		
		 

	}

}
