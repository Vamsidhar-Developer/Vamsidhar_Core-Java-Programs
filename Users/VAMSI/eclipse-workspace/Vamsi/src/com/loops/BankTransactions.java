package com.loops;

import java.util.Scanner;

public class BankTransactions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        double totalDeposited = 0;
        double totalWithdrawn = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nTransaction " + i);
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();


            if (choice == 1) {

                balance = balance + amount;
                totalDeposited = totalDeposited + amount;

                System.out.println("Amount Deposited Successfully");

            } else if (choice == 2) {

                if (amount <= balance) {

                    balance = balance - amount;
                    totalWithdrawn = totalWithdrawn + amount;

                    System.out.println("Amount Withdrawn Successfully");

                } else {

                    System.out.println("Insufficient Balance");
                }

            } else {

                System.out.println("Invalid Choice");
            }
        }

        System.out.println("\n----- FINAL DETAILS -----");
        System.out.println("Final Balance    : " + balance);
        System.out.println("Total Deposited  : " + totalDeposited);
        System.out.println("Total Withdrawn  : " + totalWithdrawn);

        sc.close();
    }
}
		 
		
	 
	