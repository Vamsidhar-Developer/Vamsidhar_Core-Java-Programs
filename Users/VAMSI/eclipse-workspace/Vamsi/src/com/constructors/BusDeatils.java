package com.constructors;

import java.util.Scanner;

public class BusDeatils {
	
	String busName;
	int busId;
	String busModel;
	double busPrice;
	int busCapacity;
	
	BusDeatils(String busname,int busId,String busModel,double busPrice,int busCapacity){
		
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
		
		
		 BusDeatils obj=new  BusDeatils(name,id,model,price,range);
		 obj.show();
	 
		
		
	}

}
