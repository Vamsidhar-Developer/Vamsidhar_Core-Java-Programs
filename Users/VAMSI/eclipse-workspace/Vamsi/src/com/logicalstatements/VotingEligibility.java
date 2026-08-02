package com.logicalstatements;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("------------Congratulations-------------");
			System.out.println("Your age Eligible for Voting");
		}
		else {
			System.out.println("--------------Sorry----------------");
			System.out.println("Your age Not Eligible for Voting");

		}
		sc.close();
		

	}

}
