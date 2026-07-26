package com.constructors;

public class TestDemo {
	
	int x;
	
	
	TestDemo(){
		this(10);
		System.out.println("No Args Constructor Loading"); 
		System.out.println(x); 
		
	}
	TestDemo(int x){
		this.x=x;
		System.out.println("Parameter Constructor Loading"); 
		 
	}

	public static void main(String[] args) {
		
		new TestDemo();
		 

	}

}
