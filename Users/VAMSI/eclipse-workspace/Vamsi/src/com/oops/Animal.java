package com.oops;

public interface Animal {

	public static final String orgName = "Vamsi's Pet Store";

	public abstract void sound();

	public abstract void eat();

	default void run() {

		System.out.println("All Animals are Can Walk and Run");
		hello();

	}
	default void sleep() {
		System.out.println("All Animals can Sleep");
		hello();
	}

	static void breath() {
		
		System.out.println("All Animal Can Breath");


		
	}
	private void hello() {
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
	}

}
