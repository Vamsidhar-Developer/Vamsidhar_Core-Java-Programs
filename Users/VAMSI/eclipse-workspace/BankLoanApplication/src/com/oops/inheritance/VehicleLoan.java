package com.oops.inheritance;

public class VehicleLoan extends LoanImpl {
	void getLoanDocInfo() {
		System.out.println("***All the Vehicle Loan Documents are Verifies Successfully***");
	}

	@Override
	public double getLoanROI() {
		double roi = 8.50;
		int cibil = getCibilScore();
		if (cibil >= 300 && cibil <= 549) {
			System.out.println("Poor credit score – Loan approval is difficult");
			roi = roi + 3.5;
		} else if (cibil >= 550 && cibil <= 699) {
			System.out.println("Fair credit score – Loan approval may require additional verification");
			roi = roi + 2.0;
		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println("Good credit score – Eligible for most loan products");
			roi = roi + 1.0;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("Excellent credit score – High chances of loan approval");
			roi = roi + 0.5;
		} else {
			System.out.println("Invalid cibil Information ");
			System.out.println("Please contact your Relation-Ship Manager In ypur Bank ");
			System.out.println("***Thank you visit Again Vamsidhar National Bank***");
		}
		return roi;
	}

	public static void main(String[] args) {
		System.out.println("*****Welcome to Vamsidhar National Bank for Vehicle Loan Banking*****");

		VehicleLoan vl = new VehicleLoan();
		int age = vl.getCustomerAge();
		double salary = vl.getCustomerSalary();
		int cibil = vl.getCibilScore();
		vl.getLoanDocInfo();

		if (salary >= 800000.00 && age >= 25 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic Information is Valid ");
			System.out.println("Now Personal Details");
			if (vl.isPhoneValid() && vl.isAadharValid() && vl.isPanValid()) {
				System.out.println("*****Congratulations*****");
				System.out.println("Details are Good and Vehicle Loan got Approved");
				System.out.println("Your Loan Interest rate is:" + vl.getLoanROI());
			} else {
				System.out.println("Something Went Wrong !!!");
			}
		} else {
			System.out.println("You are Not Eligible for Vehicle Loan and your loan got Rejected");
		}
	}

}
