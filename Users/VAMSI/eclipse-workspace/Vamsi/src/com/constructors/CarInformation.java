package com.constructors;

public class CarInformation {
	
	String model;
	String company;
	double price;
	
	

	public CarInformation(String model, String company, double price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public CarInformation(CarInformation c,String n, String comp) {
		super();
		this.model = n;
		this.company =comp ;
		this.price = c.price;
	}
	void increasePrice(double amount) {
		
		price=price+amount;
	}
	void display() {
		
		System.out.println("Car Model:"+model);
		System.out.println("Car Company:"+company);
		System.out.println("Car Price:"+price);
		
	}

	public static void main(String[] args) {
		
		System.out.println("-------------Car One Details--------------");
		CarInformation obj1=new CarInformation("Punch","TATA",120000);
		obj1.display();
		
		System.out.println("-------------Car Two Details--------------");
		CarInformation obj2=new CarInformation(obj1,"Tyroon","VW");
		obj2.increasePrice(150000);
		obj2.display();
	}

}
