package com.Javaintro;

public class Demo01 {
	 
	   
	  
		  
		 static void method1()
		 {
			 
			 Demo01 v1=new Demo01();
			 
			 v1.method2();
		  System.out.println("Method 1 executed ");
		  
	  }
	  void method2() {
		  
		  method1();
		  System.out.println("Method 2 executed");
		 
		 
		  
	  }

	public static void main(String[] args) {
		
		
		System.out.println("Main method executed");
		
		//method1();
		 Demo01 v1=new Demo01();
		//v1.method2();
		
	 
		
	 
	 
	 

	}

}
