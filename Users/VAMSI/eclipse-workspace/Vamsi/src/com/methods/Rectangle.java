package com.methods;

import java.util.Scanner;

public class Rectangle {
	double AreaofRectangle(double length,double width){
		double area=length*width;
		System.out.println("Area of the Rectangle is: "+area);
		return area;
		
	}

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of the Rectangle:");
		double len=sc.nextDouble();
		System.out.println("Enter Width of the Rectangle:");
		double wid=sc.nextDouble();
		obj.AreaofRectangle(len,wid); 

	}

}
