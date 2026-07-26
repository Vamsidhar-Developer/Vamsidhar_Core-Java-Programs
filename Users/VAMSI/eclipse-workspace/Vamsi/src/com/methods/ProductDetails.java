package com.methods;

public class ProductDetails {
	
	int ProductId;
	String ProductName;
	double ProductPrice;
	
	ProductDetails(int id,String name,double price){
		ProductId=id;
		ProductName=name;
		ProductPrice=price;			
	}
	
	public static void main(String[] args) {
		 
		ProductDetails obj=new ProductDetails(18,"COKE",50.25);
		obj.show();
		
	}
	void show()
	{
		System.out.println("The Product Id: "+ProductId);
		System.out.println("The Product Name: "+ProductName);
		System.out.println("The Product Price: "+ProductPrice);
	}

}
