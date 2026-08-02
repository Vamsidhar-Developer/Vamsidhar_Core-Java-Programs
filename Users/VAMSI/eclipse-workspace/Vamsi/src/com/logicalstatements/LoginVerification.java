package com.logicalstatements;

import java.util.Scanner;

public class LoginVerification {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please Enter UserName: ");
		 String username=sc.next();
		  
	 
		 if(username.equals("Vamsi@123")) {
			 System.out.println("Please Enter PassWord");
			 
			 int password=sc.nextInt();
			 
			 if(password==1234) {
				 System.out.println("Please Enter your Role (Admin/User): ");
				 
				 String role=sc.next();
				 if(role.equals("Admin")) {
					 System.out.println("Welcome to Admin Dash Board");
				 }
				 else {
					 System.out.println("Welcome to User Dash Board");
				 }
				 
			 }else {
				 System.out.println("Invalid PassWord");
			 }
			 
		 }
		 else {
			 System.out.println("Invalid UserName");
		 }
		 sc.close();
		 
	}

}
