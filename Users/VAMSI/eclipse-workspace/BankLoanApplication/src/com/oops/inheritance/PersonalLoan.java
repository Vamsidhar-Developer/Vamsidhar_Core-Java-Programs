package com.oops.inheritance;

public class PersonalLoan extends LoanImpl {

	void getLoanDocInfo() {
		System.out.println("***All the Personal Loan Documents are Verifies Successfully***");
	}

	public static void main(String[] args) {
		System.out.println("*****Welcome to Vamsidhar National Bank for Personal Loan Banking*****");

		PersonalLoan pl = new PersonalLoan();
		int age = pl.getCustomerAge();
		double salary = pl.getCustomerSalary();
		int cibil = pl.getCibilScore();
		pl.getLoanDocInfo();

		if (salary >= 1000000.00 && age >= 21 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic Information is Valid ");
			System.out.println("Now Personal Details");
			if (pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
				System.out.println("*****Congratulations*****");
				System.out.println("Details are Good and Loan got Approved");
				System.out.println("Your Loan Interest rate is:" + pl.getLoanROI());
			} else {
				System.out.println("Something Went Wrong !!!");
			}
		} else {
			System.out.println("You are Not Eligible for Personal Loan ond Your got Rejected");
		}
	}

}
	

