package com.arrays;

import java.util.Scanner;

import com.oops.EngineeringStudent;
import com.oops.ManagementStudent;
import com.oops.StudentGrade;

public class StudentGradeInfo {

	public static void main(String[] args) {

		StudentGrade m1=new EngineeringStudent();
		StudentGrade m2=new MedicalStudent();
		StudentGrade m3=new ManagementStudent();
		 System.out.println("***Welcome to V-CUBE Grade Portal***");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter Your Choice:\n1.Engineering Student\n2.Medical Student\n3.Management Student ");
		 int choice=sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 System.out.println("You Choose Engineering Students Grade Portal");
			 m1.calculateGrade();
			 break;
		 case 2:
			 System.out.println("You Choose Engineering Students Grade Portal");
			 m2.calculateGrade();
			 break;
		 case 3:
			 System.out.println("You Choose Engineering Students Grade Portal");
			 m3.calculateGrade();
			 break;
		default:{
			System.out.println("Invalid Choice");
		}
			 
			 
			 
		 }
		 

	}

}
