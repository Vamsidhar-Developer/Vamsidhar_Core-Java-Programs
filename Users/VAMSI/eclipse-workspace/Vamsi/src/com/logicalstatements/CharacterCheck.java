package com.logicalstatements;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Digit or Alphabet or Special Character: ");
		char ch=sc.next().charAt(0);
		
		if (ch>='A' && ch<='Z' ||ch>='a' && ch<='z' ) {
			System.out.println("Given Character is a Alphabet");
		}
		else if (ch>='0' && ch <='9') {
			System.out.println("Given Character is a Number");
		}else {
			System.out.println("Given Character is a Special Symbol");
		}
		sc.close();

	}

}
