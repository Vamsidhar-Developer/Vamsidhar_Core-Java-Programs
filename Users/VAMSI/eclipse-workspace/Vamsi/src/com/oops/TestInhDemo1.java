package com.oops;

public class TestInhDemo1 {
	int id = 101;
	String name = "Vamsi";
	
	
  
 
		 @Override
		public String toString() {
			return "Employee Info[Id: "+id+ " Name: " +name;
		
	}
	 

	TestInhDemo1() {

	}
	
	void show(){
		System.out.println("Show Method Called "+this.getClass());
	}

	public static void main(String[] args) {
		
 		
		TestInhDemo1 t1 = new TestInhDemo1();
		System.out.println(t1);
		TestInhDemo1 t2 = new TestInhDemo1();
		System.out.println(t2);
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		System.out.println(t1.equals(t2));
		TestInhDemo1 t3 = new TestInhDemo1();
		t3=t2;
		System.out.println(t3);
		System.out.println(t2.equals(t3));
		System.out.println(t2==t3);
		t2.show();

	}

}
