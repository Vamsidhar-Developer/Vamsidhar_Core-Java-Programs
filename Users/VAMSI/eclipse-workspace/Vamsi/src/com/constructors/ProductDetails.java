package com.constructors;

public class ProductDetails {
	
	String productName;
	String productModel;
	double price;
	
	 ProductDetails (String productName,String productModel,double price){
		 
		 this.productName=productName;
		 this.productModel=productModel;
		 this.price=price; 
		 
	 }
    ProductDetails ( ProductDetails  p){
	 
	  	 this.productName=p.productName;
		 this.productModel=p.productModel;
		 this.price=p.price;
	  	 
	 }
  		void show() {
  			
  			System.out.println("Product Name is:"+productName);
  			System.out.println("Product Model is:"+productModel);
  			System.out.println("Product Price is:"+price);
  			
  		}
      
	 public static void main(String[] args) {
		
		 System.out.println("-------------Original Constructor--------------");
		 ProductDetails obj= new  ProductDetails("Laptop","HP-Pavilion",70000.00);
		 obj.show();
		 
		 System.out.println("-------------Copy Constructor--------------");
		 ProductDetails obj2=new  ProductDetails(obj); 
		 obj2.show();
		 
		
	}

}
