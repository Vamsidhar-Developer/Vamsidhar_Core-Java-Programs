package com.ecommerce.management;

public class CustomerDetails extends ECommerceImpl {

	public static void main(String[] args) {
		
		
		CustomerDetails c1=new CustomerDetails();
		
		c1.displayWelcomeMessage();
		String customerID=c1.getCustomerId();
		String customerName=c1.getCustomerName();
		 
		 		
	    if(customerID.equals("12345") && customerName.equals("Vamsi@2219")) {
	    	System.out.println("***** Login Successfully *****");
	    	System.out.println("Welcome Vamsidhar");
	    	System.out.println("\nWelcome to the V-Cart Online Shopping Portal");
	    	String number=c1.getCustomerPhone();
	    	if(c1.isPhoneValid(number)){
	    		
	    	System.out.println("Mobile Number Added Successfully");
	    	String email=c1.getCustomerEmail();
	    		if(c1.isEmailValid(email)){
	    			System.out.println("Email Added Successfully");
	    		}
	    		else {
	    			System.out.println("Invalid Email ID");
	    		}
	    	}
	    	else {
	    		System.out.println("Invalid Mobile Number");
	    	}
	    	
	    }else {
	    	System.out.println("Something Went Wrong");
	    	System.out.println("Invalid User-ID or UserName");
	    }
		
	}

}
