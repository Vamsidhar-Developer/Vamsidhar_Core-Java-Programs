package com.Javaintro;

public class Calculator {
	static String StdSchoolName;
	static int SchoolPincode;
	int StdId;
	String StdName;
	static {
		System.out.println("Static block Executed");
		StdSchoolName="Prathibha Public School";
		SchoolPincode=524223;
		
	}
	
	{
		
		System.out.println("Instance Block Executed");
	}
	
	void Display() {
		System.out.println("Student Id: "+StdId);
		System.out.println("Student Name:"+StdName);
		System.out.println("Student School Pincode: "+SchoolPincode);
		System.out.println("Student School Name: "+StdSchoolName);
		
	}
	

	public static void main(String[] args) {
		
		Calculator v1 =new Calculator();
				v1.StdId=1001;
				v1.StdName="Vamshi";
				
			System.out.println("Student no:1 details");	
			v1.Display();
			Calculator s1 =new Calculator();
			s1.StdId=1002;
			s1.StdName="Pranav";
			
		System.out.println("Student no:2 details");	
		s1.Display();
			
				
	}

}
