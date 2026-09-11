package com.oops;

class  Developer implements Attendance{

	@Override
	public void markAttendance() {
		 System.out.println("Developer Attendance Registered Successfully ");
		
	}	
		
}
class Tester implements Attendance{

	@Override
	public void markAttendance() {
		 System.out.println("Tester Attendance Registered Successfully ");
		
	}

}
class Manager implements Attendance{

	@Override
	public void markAttendance() {
		 System.out.println("Manager Attendance Registered Successfully ");
		
	}
	
}

public class AbstractionTestDemo1 {

	public static void main(String[] args) {
	 
//		Developer d1=new Developer();
//		Tester t1=new Tester();
//		Manager m1=new Manager();
//		d1.markAttendance();
//		t1.markAttendance();
//		m1.markAttendance();
		Attendance a1 = new Developer();
		Attendance a2 = new Tester();
		Attendance a3 = new Manager();

		a1.markAttendance();
		a2.markAttendance();
		a3.markAttendance();
//		 

	}

}

 