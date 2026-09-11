package com.oops;

public class TestDemo2 extends Account{

	public static void main(String[] args) {
		
		Account t2=new TestDemo2();
		t2.method2();
		t2.method3();
		Account.method1();	 

	}

	@Override
	void method3() {
		 System.out.println("Abstract Method called from Test Demo 3");
		
	}

}
