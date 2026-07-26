package com.constructors;

class Product{
	
	String productName;
	String productModel;
	double price;
	
	Product(){
		
		System.out.println("No Args Costructor from Product");
	}
	 


 }
public class Mobile extends Product{
	
	Mobile(){
		
		System.out.println("No Args Costructor from Mobile");	
	}
	
	Mobile(String name,String model,double price){
		
		this.productName=name;
		this.productModel=model;
		this.price=price;
		
	}
	void display() {
		
		System.out.println("Product Name: "+productName);
		System.out.println("Product Model: "+productModel);
		System.out.println("Product Price: "+price);
		
	}
 
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		 
		Mobile obj=new  Mobile("Laptop","HP-PAVILION-16",70000);
		obj.display();
		
		System.out.println("Main Method Ended");
	 
		 
	}

}
