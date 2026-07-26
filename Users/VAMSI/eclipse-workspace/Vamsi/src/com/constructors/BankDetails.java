package com.constructors;

import java.util.Scanner;

public class BankDetails {
	
	static String bankName="SBI";
	static String ifsc="SBIN0015246";
	static long Anumber=956478123110l;
	
	long anumber;
	
	String aname;
	double balance;
	 
	BankDetails (String aname,double balance){
	     
		this.aname=aname;
		this.balance=balance;
		anumber=Anumber;
		Anumber++;
		
		
		
	}
	void show() {
		
		System.out.println("Account Holder Name is: "+aname);
		System.out.println("Account Holder Bank : "+bankName);
		System.out.println("Account Holder Bank IFCS : "+ifsc);
		System.out.println("Account Holder Bank Account Number: "+anumber);
		System.out.println("Account Holder Bank balance : "+balance);
	 
		
		
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder Name:  ");
		String name=sc.next();
		 
		System.out.println("Enter Account Holder Balance:  ");
	    double blnce=sc.nextDouble();
	    BankDetails obj=new BankDetails(name,blnce);
	    
	    obj.show();
	    
	    
		} 
	}

}
