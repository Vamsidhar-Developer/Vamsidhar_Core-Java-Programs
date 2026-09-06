package com.oops.inheritance;

import java.util.Scanner;

public class LoanImpl implements Loan {

	Scanner sc = new Scanner(System.in);

	@Override
	public int getCustomerAge() {
		System.out.println("Please Enter your Age: ");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public double getCustomerSalary() {
		System.out.println("Please Enter your Salary: ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getCibilScore() {
		System.out.println("Please Enter your Cibil Score: ");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("Please Enter your Mobile Number: ");
		String phone = sc.next();

		return phone.matches("[6-9][0-9]{9}");
	}

	@Override
	public boolean isAadharValid() {
		System.out.println("Please Enter your AADHAR Number: ");
		String aadhar = sc.next();

		return aadhar.matches("[1-9][0-9]{11}");
	}

	@Override
	public boolean isPanValid() {
		System.out.println("Please Enter your Pan-card Number: ");
		String pancard = sc.next();

		return pancard.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	@Override
	public double getLoanROI() {

		double roi = 8.5;

		int cibil = getCibilScore();

		if (cibil >= 300 && cibil <= 549) {

			System.out.println("Poor credit score – Loan approval is difficult");

			roi = roi + 4.5;

		} else if (cibil >= 550 && cibil <= 699) {

			System.out.println("Fair credit score – Loan approval may require additional verification");

			roi = roi + 3.0;

		} else if (cibil >= 700 && cibil <= 749) {

			System.out.println("Good credit score – Eligible for most loan products");

			roi = roi + 1.5;

		} else if (cibil >= 750 && cibil <= 900) {

			System.out.println("Excellent credit score – High chances of loan approval");

			roi = roi + 0.5;

		} else {

			System.out.println("Invalid CIBIL Information");
			System.out.println("Please contact your Relationship Manager in your bank");
			System.out.println("*** Thank you, visit again Vamsidhar National Bank ***");

			return 0;
		}

		System.out.println("Loan ROI = " + roi + "%");
		return roi;
	}
}

