package com.methods;

public class BankDetailsTestDemo {
	
	double balance=10000;
	
       

	void main() {
			
	 System.out.println("Main Method Started");
	 CheckBalance();
	 Deposit(15000);
	 withdraw(3000);
	 System.out.println("Main Method Ended");
		
	}
	void CheckBalance() {
		System.out.println("The Current Balance is: "+balance);
		
	}
	void Deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit Amount is: "+amount);
		CheckBalance();
		
	}
	void withdraw(double amount) {
		if( amount <= balance) {
			balance=balance-amount;
			System.out.println("Withdraw Amount: "+amount);
		}else {
			System.out.println("Balance Not Enough!!!");
		}
		CheckBalance();
	}
	
}
