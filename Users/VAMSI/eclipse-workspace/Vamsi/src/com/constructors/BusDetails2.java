 package com.constructors;

import java.util.Scanner;

public class BusDetails2 {
	
	String busName;
	int busId;
	String busModel;
	double busPrice;
	int busCapacity;
	
	
	public BusDetails2(String busName, int busId) {
		super();
		this.busName = busName;
		this.busId = busId;
	}
	
	public BusDetails2(String busName, String busModel, int busCapacity) {
		super();
		this.busName = busName;
		this.busModel = busModel;
		this.busCapacity = busCapacity;
	}
	 

	public BusDetails2(String busName, int busId, String busModel, double busPrice) {
		super();
		this.busName = busName;
		this.busId = busId;
		this.busModel = busModel;
		this.busPrice = busPrice;
	 
	}
	BusDetails2(String busname,int busId,String busModel,double busPrice,int busCapacity){
		
		this.busName=busname;
		this.busId=busId;
		this.busModel=busModel;
		this.busPrice=busPrice;
		this.busCapacity=busCapacity;
			
	}
	
	void show() {
		
		System.out.println("Bus Name: "+busName);
		System.out.println("Bus Id: "+busId);
		System.out.println("Bus Model: "+busModel);
		System.out.println("Bus Price: "+busPrice);
		System.out.println("Bus Capacity: "+busCapacity);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Bus Name:");
		String name=sc.next();
		
		System.out.println("Enter the Bus Id:");
		int id=sc.nextInt();
		
		System.out.println("Enter the Bus Model:");
		String model=sc.next();
		
		System.out.println("Enter the Bus Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter the Bus Range:");
		int range=sc.nextInt();
		
		 System.out.println("----------Constructor 1------------");
		
		 BusDetails2 obj1=new  BusDetails2(name,id);
		 obj1.show();
		 
	     System.out.println("----------Constructor 2------------");
	     
		 BusDetails2 obj2=new  BusDetails2(name,model,range);
		 obj2.show();
		 
		 System.out.println("----------Constructor 3------------");
	 
		 BusDetails2 obj3=new  BusDetails2(name,id,model,price,range);
		 obj3.show();
		 
		 System.out.println("----------Constructor 4------------");
	 
		 BusDetails2 obj4=new  BusDetails2(name,id,model,price);
		 obj4.show();
		 
		 System.out.println("----------Constructor 5------------");
	 
		 BusDetails2 obj5=new  BusDetails2(name,id,model,price,range);
		 obj5.show();
	 
		
		
	}

}