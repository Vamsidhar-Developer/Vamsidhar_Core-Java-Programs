package com.ecommerce.management;

public class ProductDetails extends ECommerceImpl {

	public static void main(String[] args) {
		ProductDetails p1=new ProductDetails();
		
		p1.displayWelcomeMessage();
		int productID=p1.getProductID(); 
		 
		switch(productID) {
		case 1:
			System.out.println("You Seleted Laptop");
			double total=p1.CalculateTotalAmount();
			
			
			break;
		case 2:
			System.out.println("You Seleted I-Phone");
			break;
		case 3:
			System.out.println("You Selected I-Pad");
			break;
			
		default:
			System.out.println("Invalid Choice");
		}	
		

	}

}
