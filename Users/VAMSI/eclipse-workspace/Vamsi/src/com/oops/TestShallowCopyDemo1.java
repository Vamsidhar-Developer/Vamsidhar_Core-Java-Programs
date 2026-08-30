package com.oops;

import com.oops.TestDeepCopyDemo1.Address1;

class Student implements Cloneable {

	int sid;
	String sname;
	Address address;
	public Address1 address1;

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}

class Address {

	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Method Started");

		Address address = new Address("Hyderbad");
		Student s1 = new Student(101, "Vamsidhar", address);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("***************************");

		Student s2 = (Student) s1.clone();

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("***************************");

		s2.sid = 102;
		s2.sname = "Venugopal";
		s2.address.city = "Banglore";

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("***************************");

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("***************************");

		System.out.println(s1);
		System.out.println(s2);

		System.out.println("Main Method Ended");

	}

}
