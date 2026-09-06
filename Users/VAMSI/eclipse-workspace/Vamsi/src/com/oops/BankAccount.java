package com.oops;

public class BankAccount {

	private long accountNumber;
	private String holderName;
	private double balance;
	
	public void deposit(double amount) {

		balance=balance+amount;
		System.out.println("***Amount Deposited Successfully***");
		System.out.println("Your Current Balance is: "+balance);
	}
	public void withdraw(double amount) {
		
	
		if(amount <=balance && balance >0) {
		balance=balance-amount;
		System.out.println("***Amount Debited Successfully***");
		System.out.println("Your Current Balance is: "+balance);
	}else{
		System.out.println("Insufficient balance");
	}
		
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setHolderName(String holderName) {
		this.holderName=holderName;
	}
	public String getHolderName(){
		return holderName;	
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}

}
