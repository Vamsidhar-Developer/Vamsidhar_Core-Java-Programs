package com.oops;

public class BurgerOrder2 extends OrderDetails2{
	
	public void PrepareFood() {
		System.out.println("***Burger Details***");
	}

	public static void main(String[] args) {
	   
		BurgerOrder2 b1=new BurgerOrder2();
		b1.prepareFood();
		b1.getInput();
		b1.display();
		 

	}

}
