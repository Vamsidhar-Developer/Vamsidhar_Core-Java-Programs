package com.constructors;

   public class Product{
	
	String productName;
	double productPrice;
	int quantity;
	
	Product(){
	this("Laptop");
		
	}
	Product(String name){
		this(name,55000);
			
	}
	Product(String name,double price){
		this(name,price,2);
		
	}
	Product(String name,double price,int quantity){
		
		this.productName=name;
		this.productPrice=price;
		this.quantity=quantity;
		
		
	}
	void display() {
		
		double totalCost=productPrice*quantity;
		
		System.out.println("Product Name is: "+productName);
		System.out.println("Product Price is: "+productPrice);
		System.out.println("Product Quantity is: "+quantity);
		System.out.println("Total Cost is: "+totalCost);
		
	}

	public static void main(String[] args) {
		
		Product obj=new Product();
		obj.display();
		 
	}

}
