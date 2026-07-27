package com.constructors;

public class BankAccount {
	
	String accountHolder;
	long accountNumber;
	double balance;
	
	
	BankAccount(){
		this(" ");
	}
	BankAccount(String accountHolder){
		this("",0);
		
	}
	BankAccount(String accountHolder,long accountNumber){
		this(" ",0,0.0);
		
	}
	BankAccount(String accountHolder,long accountNumber,double balance){
	
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	void display() {
		
		System.out.println("Account Holder Name: "+accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);
		
	}
	

	public static void main(String[] args) {
		
		BankAccount obj1=new BankAccount("Unknown",0,0.0);
		BankAccount obj2=new BankAccount("Krishna",0,0.0);
		BankAccount obj3=new BankAccount("Krishna",1234567890,0.0);
		BankAccount obj4=new BankAccount("Krishna",1234567890,50000.0);
		
		System.out.println("----------No Args Constructor-----------");
		obj1.display();
		System.out.println("----------One Args Constructor-----------");
		obj2.display();
		System.out.println("----------Two Args Constructor-----------");
		obj3.display();
		System.out.println("----------Three Args Constructor-----------");
		obj4.display(); 
		
	}

}
