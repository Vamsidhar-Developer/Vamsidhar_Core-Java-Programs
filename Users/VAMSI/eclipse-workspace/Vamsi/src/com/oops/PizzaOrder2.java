package com.oops;

import java.util.Scanner;

public class PizzaOrder2 extends OrderDetails2 {
	
 
	public void prepareFood() {
		System.out.println("***Pizza Details***");
	}

	public static void main(String[] args) {
		
		PizzaOrder2 p1=new PizzaOrder2();
		p1.prepareFood();
		p1.getInput();
		p1.display();
		 

	}

}
