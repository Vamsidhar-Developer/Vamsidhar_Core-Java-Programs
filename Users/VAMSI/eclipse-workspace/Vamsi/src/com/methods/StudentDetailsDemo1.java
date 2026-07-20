package com.methods;

import java.util.Scanner;

public class StudentDetailsDemo1 {
	
	void StdId(int id) {
		System.out.println("Student Id: "+id);
		
	}
	void StdName(String fname,String lname) {
		System.out.println("Student name: "+fname +" "+lname);
		
		
	}
	double myage(double age) {
		System.out.println("My Age is :"+age);
		return age;
		
	}
	void myRollNumber() {

		 Scanner sc=new Scanner(System.in);  
		 System.out.println("Enter Your Roll Number: ");
		 int number=sc.nextInt(); 
		 System.out.println("Student Roll Number is: "+number);
	}
	String fathername(String faName) {
		
		System.out.println(" Father name is : "+faName);
		return faName;
	}
     void mothername(String mName) {
		
		System.out.println(" Mother name is : "+mName);
	}
	String myBranch(String branch){
		
		System.out.println("My branch is :"+branch);
		return branch;
		
	}
	double myPercentage(double percentage) {
		System.out.println("My Percentagee is: "+percentage);
		return percentage;
	}
   char mySchoolCode(char code) {
	   System.out.println("My School Code: "+code);
	   return code;
		
	}boolean schoolStatus(boolean status){
	 
		System.out.println("my School Status: "+status);
		return status;
		
	}
	

	  void main() {
		 System.out.println("Main Method Started");
		 
	 Scanner sc=new Scanner(System.in);  
		 
		 System.out.println("Enter Id: ");
		 int id=sc.nextInt();
		 StdId(id);
		 
		 System.out.println("Enter First Name: ");
		 String name1=sc.next();
		 System.out.println("Enter Second Name: ");
		 String name2=sc.next(); 
		 StdName(name1,name2);
		 
		 System.out.println("Enter your age: ");
		 double age=sc.nextDouble();
		 myage(age);
		 
		 System.out.println("Enter Father name : ");
		 String father=sc.next();
		 sc.nextLine();
		 fathername(father);
		 
	 
		 System.out.println("Enter mother name : ");
		 String mother=sc.nextLine();
		 mothername(mother);
		 
		 System.out.println("Enter your branch : ");  
		 String b=sc.next();
		 myBranch(b);
		 
		 System.out.println("Enter your percentage : ");  
		 double per=sc.nextDouble();
		 myPercentage(per);
		 
		 System.out.println("Enter your School code: ");
		 char code=sc.next().charAt(0);
		 mySchoolCode(code);
		 
		 System.out.println("Enter your School : ");
		 boolean status=sc.nextBoolean();
		 schoolStatus(status);
		 
	} 
	  

}
