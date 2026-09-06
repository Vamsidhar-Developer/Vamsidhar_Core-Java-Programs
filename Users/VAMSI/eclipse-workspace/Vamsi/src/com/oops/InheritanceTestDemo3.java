package com.oops;

class Vehicle3{
	int speed=50;
	void display() {
		System.out.println("Display Method called from Vehicle class *\n*Speed** :"+speed);
	}
}
class Car2 extends Vehicle3 {
	int speed=100;

@Override	
 void display() {
	System.out.println("Display Method called from Car class \n**Speed** :"+speed);
	}

}

public class InheritanceTestDemo3 {

	public static void main(String[] args) {
    
		Vehicle3 v1=new Car2();
		
		System.out.println("Speed: " +v1.speed);
		
		v1.display();

	}

}
