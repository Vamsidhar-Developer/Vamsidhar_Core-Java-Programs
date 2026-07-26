package com.constructors;

public class CountObjects {
	static int count=0;
	
	CountObjects(){
		count=count+1;
	}
	

	public static void main(String[] args) {
		
		CountObjects v1=new CountObjects();
		CountObjects s1=new CountObjects();
		CountObjects m1=new CountObjects();
		CountObjects r1=new CountObjects();
		
		System.out.println("Number of time object is repeating: "+count);
		 

	}

}
