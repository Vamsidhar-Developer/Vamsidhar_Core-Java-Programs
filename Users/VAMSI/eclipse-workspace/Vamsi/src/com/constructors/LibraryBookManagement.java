package com.constructors;
		
	
public class LibraryBookManagement {
	
	int bookId;
	String bookTitle;
	String author;
	double bookPrice;
	 
	
	LibraryBookManagement(int bookId,String bookTitle,String author,double bookPrice){
		
		this.bookId=bookId;
		this.bookTitle= bookTitle;
		this.author=author;
		this.bookPrice=bookPrice;
	 
		
	}
	LibraryBookManagement(LibraryBookManagement l){
		
		this.bookId=l.bookId;
		this.bookTitle=l.bookTitle;
		this.author=l.author;
		this.bookPrice=l.bookPrice;
		
	}
	void applyDiscount(double percentage) {
		
		bookPrice=bookPrice-(bookPrice*percentage/100);
	}
	
	void display() {
		
	 
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Title: "+bookTitle);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+bookPrice);	 
		
	}
	
	   public static void main(String[] args) {
	 
		
		LibraryBookManagement obj1=new LibraryBookManagement(101,"RadhaMalik","Vamsi",5000);
		
		LibraryBookManagement obj2= new LibraryBookManagement(obj1);
		
		obj1.display();
		
		obj2.applyDiscount(20);
		obj2.display();		 
	   
	}

}
