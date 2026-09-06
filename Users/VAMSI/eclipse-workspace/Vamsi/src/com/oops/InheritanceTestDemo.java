package com.oops;

 
	class Vehicle{
		void start() {
			System.out.println("Start Method Calling from Vehicle Class");
		}
	}
	class Car extends Vehicle{
		void drive() {
			System.out.println("Drive Method Calling from Drive Method ");
		}
	}
	public class InheritanceTestDemo {
	public static void main(String[] args) {
		 
		Car c1=new Car();
		c1.start();
		c1.drive();
		
	
	}

}
