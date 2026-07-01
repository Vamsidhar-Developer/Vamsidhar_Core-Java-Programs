package com.Javaintro;

public class Hare {
	
	class A{
		B b;
		
		  @Override
			protected void finalize() {
				  
				  System.out.println("object Destroyed");
				 
			}
			  
	}

	class B{
		A a;
		
		  @Override
			protected void finalize() {
				  
				  System.out.println("object Destroyed");
				 
			}
			  
	}

	 
	 

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Hare vamsi=new Hare();
		
		A obj1=vamsi.new A();
		B obj2=vamsi.new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		
		obj1=null;
		obj2=null;
		
		
	 	 
		System.gc();
	    
	}

}
