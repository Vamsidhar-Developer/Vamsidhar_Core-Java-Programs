package com.methods;
import java.util.Scanner;

public class MethodTestDemo2 {
	 double CalculateInterest(double principle, double rate ,double time){
		double  interest=(principle*time*rate)/100;
		 
			System.out.println("Total Interst is: "+ interest);
			
			
		 
		 return interest;
		 
		
	}
  void main() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Principle Amount: ");
		 double princ=sc.nextDouble();
		 System.out.println("Enter Principle Interest: ");
		 double inter=sc.nextDouble();
		 System.out.println("Enter Principle Time: ");
		 double time=sc.nextDouble();
		 CalculateInterest(princ,inter,time);
	 
		 
 		 
	 
		 
		
		
	 

	}

}
