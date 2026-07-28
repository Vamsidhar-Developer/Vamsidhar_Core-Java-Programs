package com.constructors;

public class MobileDetails {
	
	int mobileId;
	String brand;
	double price;
	
	

	public MobileDetails(int mobileId, String brand, double price) {
		super();
		this.mobileId = mobileId;
		this.brand = brand;
		this.price = price;
	}
	public MobileDetails(MobileDetails m,int model,String brand) {
		super();
		this.mobileId =model;
		this.brand = brand;
		this.price = m.price;
	}
	void applyDiscount(double amount) {
		
		price=(price-price*amount/100);
	}
	void display() {
		
		System.out.println("Mobile Id: "+mobileId);
		System.out.println("Mobile Brand: "+brand);
		System.out.println("Mobile Price: "+price);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("---------------First Mobile Details-----------------");
		MobileDetails obj1=new MobileDetails(111,"VIVO",49000);
		obj1.display();
		
		System.out.println("---------------Second Mobile Details-----------------");
		MobileDetails obj2=new MobileDetails(obj1,222,"OPPO");
		obj2.applyDiscount(20);
		obj2.display();
		 
		

	}

}
