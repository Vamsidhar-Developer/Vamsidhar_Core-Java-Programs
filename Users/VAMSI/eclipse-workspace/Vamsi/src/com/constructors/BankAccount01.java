package com.constructors;

    public class BankAccount01{
	
    	long accountNumber;
    	String accountHolder;
    	double balance;
    	
    	BankAccount01(long accountNumber,String accountHolder,double balance){
    		
    		this.accountNumber=accountNumber;
    		this.accountHolder=accountHolder;
    		this.balance=balance;
    		
    	}
    	BankAccount01(BankAccount01 b,long number,String name){
    		
    		this.accountNumber=number;
    		this.accountHolder=name;
    		this.balance=b.balance;
    	}
    	void deposit(double amount) {
    		
    		balance=balance+amount;
    	}
    	
    	void display() {
    		
    		System.out.println("Account Number: "+accountNumber);
    		System.out.println("Account Holder Name: "+accountHolder);
    		System.out.println("Account Balance: "+balance);
    		
    	}
    	
    
	public static void main(String[] args) {
		
		BankAccount01 obj1=new BankAccount01(123456789,"Vamshidhar",50000.00);
		obj1.display();
		
		BankAccount01 obj2=new BankAccount01(obj1,123456781,"rahul");
		obj2.deposit(10000);
		obj2.display();
		
		
		
		
		
		
		
		
		
	 

	}

}
