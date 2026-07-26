package com.constructors;

import java.util.Scanner;

public class PatientDetails {
	
	String patientName;
	int patientAge;
	double roomCharge;
	int totalDays;
	
	PatientDetails(String patientName,int patientAge, double roomCharge,int totalDays ){
		
		this. patientName= patientName;
		this.patientAge=patientAge;
		this. roomCharge=roomCharge;
		this.totalDays=totalDays;
		
		
	}
	void Display() {
		
		double totalBill=roomCharge*totalDays;
		System.out.println("Patient Name: "+patientName);
		System.out.println("Patient Age: "+patientAge);
		System.out.println("Patient Room Charge: "+roomCharge);
		System.out.println("Patient Total Admitted Days: "+totalDays);
		System.out.println("Patient Total Bill: "+totalBill);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Patient Name: ");
		String name=sc.next();
		
		System.out.println("Enter Patient Age: ");
		int age=sc.nextInt(); 
		
		System.out.println("Enter Patient Room Charge: ");
		double charge=sc.nextDouble();
		
		System.out.println("Enter Patient Name: ");
		int days=sc.nextInt();
		
		PatientDetails  obj=new PatientDetails(name,age,charge,days);
		obj.Display();
	}

}
