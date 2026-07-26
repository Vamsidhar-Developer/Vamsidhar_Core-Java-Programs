package com.constructors;

public class BankDetails01{
	
	long accountNo;
	String holderName;
	double balance;
	
	BankDetails01(){
		this(95562010101l);
		
	}
	BankDetails01(long accountNo){
		this(accountNo,"Vamsi");
		
	}
	BankDetails01(long accountNo, String holderName){
		this(accountNo,holderName,56005);
		
	}
	BankDetails01(long accountNo, String holderName,double balance){
		
		this.accountNo=accountNo;
		this.holderName=holderName;
		this.balance=balance;
			
	}
	void Display() {
		System.out.println("Bank Account Number: "+accountNo);
		System.out.println("Bank Account Holder Name: "+holderName);
		System.out.println("Bank Balance: "+balance);
	}
	
	public static void main(String[] args) {
		
		System.out.println("----------------Account Holder 1-------------------");
		BankDetails01 obj=new BankDetails01();
		obj.Display();
		
		System.out.println("----------------Account Holder 2-------------------");
		BankDetails01 obj2=new BankDetails01(95562010102l,"venu",85666);
		obj2.Display();
		
		System.out.println("----------------Account Holder 3-------------------");
		BankDetails01 obj3=new BankDetails01(95562010103l,"krishna",654000);
		obj3.Display();
		 

	}

}
