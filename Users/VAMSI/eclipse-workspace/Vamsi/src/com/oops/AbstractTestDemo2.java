package com.oops;

class Dog implements Animal {

	@Override
	public void sound() {

		System.out.println("The Dog Sounds BOW BOW");
	}

	@Override
	public void eat() {
		System.out.println("The Eats Bones");

	}

}

class Cat implements Animal {
	@Override
	public void sound() {
		System.out.println("The Cat Sounds MEOW MEOW");
	}

	@Override
	public void eat() {
		System.out.println("The Cat Eats the Rat");

	}

}

class Monkey implements Animal {
	@Override
	public void sound() {
		System.out.println("The Monkey Sounds KEECH KEECH");

	}

	@Override
	public void eat() {
		System.out.println("The Monkey Eats Banana");

	}

	@Override
	public void run() {
		System.out.println("Monkey can run walk and Jump");

	}
}

public class AbstractTestDemo2 {

	public static void main(String[] args) {

		System.out.println("Organisation name " + Animal.orgName);

		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Monkey();

		System.out.println("*********Dog Info*********");
		a1.sound();
		a1.eat();
		a1.run();
		a1.sleep();
		Animal.breath();
		System.out.println("***************************");
		System.out.println("*********Cat Info*********");
		a2.sound();
		a2.eat();
		a2.run();
		a2.sleep();
		Animal.breath();
		System.out.println("***************************");
		System.out.println("*********Monkey Info*********");
		a3.sound();
		a3.eat();
		a3.run();
		a3.sleep();
		Animal.breath();
		System.out.println("***************************");

	}

}
