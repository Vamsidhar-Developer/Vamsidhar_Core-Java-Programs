package com.loops;

import java.util.Scanner;

public class Mutiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num +" x " +i +" = " +(i* num));

		}
		sc.close();

	}

}
