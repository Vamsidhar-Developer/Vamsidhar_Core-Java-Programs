package com.logicalstatements;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("******* Welcome to VSTech *******");
		
		System.out.println("Please enter your Salary: ");
		double salary=sc.nextDouble();
		
		if(salary >=30000) {
			System.out.println(" Please enter you Experience in Years");
			
			int experience=sc.nextInt();
			if(experience>=5) {
				System.out.println("Please Enter your rating: ");
				int rating=sc.nextInt();
				
				if(rating>=8) {
					salary=salary+20*salary/100;
					System.out.println("You got 20% Of Bonus : "+salary);
				}else {
					salary=salary+10*salary/100;
					System.out.println("You got 10% Of Bonus : "+salary);
				}		
				
			}else {
				System.err.println("******* Sorry *******");
				System.out.println("You have Less Years Of Experience");
			}
		}
		else {
			System.err.println("******* Sorry *******");
			System.out.println("You Have Less Salary");
			
		}	
		sc.close();
		
	}

}
