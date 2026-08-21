package com.loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		int random=ran.nextInt(1,11);
		System.out.println("*** You Have 3 Chances ***");
		for(int i=1;i<=3;i++) {
			System.out.println( "Chance "+i);
		System.out.println("Please Guess a Number from (1-10): ");
		int num=sc.nextInt();
		if(random==num) {
			System.out.println("Congratulatoins You Guess the Correct Answer ");
			break;
	 
		}else {
			System.out.println("Try Again !!!");
			 
		}
		
		}
		System.out.println("*Don't Feel Bad *Better Luck Next Time*");
		System.out.println("The Correct Number is: "+random);
		sc.close();

 
	}

}
