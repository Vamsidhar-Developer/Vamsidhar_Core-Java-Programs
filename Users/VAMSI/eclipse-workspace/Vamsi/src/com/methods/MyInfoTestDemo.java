package com.methods;

public class MyInfoTestDemo {

	 void main() {
		 
		System.out.println("Main Mthod Started");
		MyName("Vamsi");
		 getMyage(22);
		 getMyCourse("java full Stack");
		 MyWeight();
		 MyVillage("Annavaram");
		 myPincode(524223);
		 myJobStatus();
		 myMaratialStatus(false);
		System.out.println("Main Mthod Ended");
		
	}
	 void MyName(String name) {
		 System.out.println("My name: "+name);
	 }
	void getMyage(int age) {
		
		System.out.println("My age is: "+age);
		 
	}
	private String getMyCourse( String course) {
	          
	         
		System.out.println("My Course: "+course);
	
	          return course;
	}
	public double MyWeight() {
		int weight=52;
		System.out.println("My Weight is: "+weight);
		return weight;
	}
	protected String MyVillage(String village) {
		System.out.println("My Village Name is: "+village);
		return village;
	}
  void myPincode(long pincode) {
	  System.out.println("My Pincode: "+pincode);
	  
  }
  void myJobStatus() {
	  boolean status=true;
	  System.out.println("My Job Status: "+status);
  }
     boolean myMaratialStatus(boolean status) {
	  System.out.println("My Marital Status: "+status);
	  return status;
  }
  
}
