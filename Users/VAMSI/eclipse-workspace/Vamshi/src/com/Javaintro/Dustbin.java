package com.Javaintro;

public class Dustbin { 	
	
 @Override
protected void finalize() {
 
	   System.out.println("Object Died");
 }
 
 

	public static void main(String[] args) {
	 
         System.out.println("Main method Started");
         
         
         
         new Dustbin();
          
         
         
         
         System.gc();
	}

}
