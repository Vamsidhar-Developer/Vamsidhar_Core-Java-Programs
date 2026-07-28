package com.constructors;

public class BookDetails {
	
	int bookId;
	String title;
	double price;
	
	 
	

	public BookDetails(int bookId, String title, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	BookDetails(BookDetails b,int id,String name){
		
		this.bookId =id;
		this.title = name;
		this.price = b.price;
		
	}
	void increasePrice(double amount) {
		
		price=price+amount;
	}
	void display() {
		
		System.out.println("Enter Book Id:"+bookId);
		System.out.println("Enter Book Title:"+title);
		System.out.println("Enter Book Price:"+price);
	}

	
	public static void main(String[] args) {
		
		System.out.println("-------------Book One Details--------------");
		BookDetails obj1=new BookDetails(111,"Bhagavadgeeta",5000.00);
		obj1.display();
		
		System.out.println("-------------Book Two Details--------------");
		BookDetails obj2=new BookDetails(obj1,112,"Ramanaya");
		obj2.increasePrice(250);
		obj2.display();
		
	}

}
