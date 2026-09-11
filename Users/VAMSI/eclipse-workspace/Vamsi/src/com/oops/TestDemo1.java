package com.oops;

public class TestDemo1 extends Account{

	public static void main(String[] args) {
		TestDemo1 t1=new TestDemo1();
		 
		 
		Account.method1();
		t1.method2();
		t1.method3();
		
		 
	}

	@Override
	void method3() {
		 System.out.println("Abstract Method-3  Called ");
	}

}
