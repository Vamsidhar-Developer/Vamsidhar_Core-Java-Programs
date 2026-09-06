package com.oops;


class Student01{
	int sid;
	String sname;
	Address01 address01;
	public Student01(int sid, String sname, Address01 address01) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address01 = address01;
	}
	public Student01(Student01 st1) {
		this.sid = st1.sid;
		this.sname = st1.sname;
		this.address01 =new Address01 (st1.address01);
	}
		
}
class Address01{
	String city;

	public Address01(String city) {
		super();
		this.city = city;
	}
	public Address01(Address01 address01) {
		this.city = address01.city;
	}
	
	
}

public class TestDeepCopyDemo1 {
	
 
	public static void main(String[] args) {
		
		 Address01 address01=new Address01("Vijayawada");
		 
		 Student01 st1=new Student01(101,"Vamsidhar",address01);
		 
		 System.out.println(st1.sid);
		 System.out.println(st1.sname);
		 System.out.println(st1.address01.city);
		 System.out.println("***********************");
		 Student01 s2=new Student01(st1);
		 
		 System.out.println(s2.sid);
		 System.out.println(s2.sname);
		 System.out.println(s2.address01.city);
		 System.out.println("***********************");
		 
		 s2.sid=102;
		 s2.sname="venugopal";
		 s2.address01.city="Guntur";
		 
		 System.out.println(st1.sid);
		 System.out.println(st1.sname);
		 System.out.println(st1.address01.city);
		 System.out.println("***********************");
		 
		 
		 System.out.println(s2.sid);
		 System.out.println(s2.sname);
		 System.out.println(s2.address01.city);
		 System.out.println("***********************"); 
		
 		 
	}
}
