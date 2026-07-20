package com.methods;

import java.util.Scanner;

public class StudentPercentage {
	
	void CalculateStudentPercentage(int tmarks,int omarks) {
		int percentage=(omarks*100)/tmarks;
		System.out.println("Student percentage: "+percentage);
	}

	  void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Obtained Marks: ");
		int omarks=sc.nextInt();
		System.out.println("Enter Total Marks: ");
		int tmarks=sc.nextInt();
		
		
		CalculateStudentPercentage(tmarks,omarks);

	}
	

}
