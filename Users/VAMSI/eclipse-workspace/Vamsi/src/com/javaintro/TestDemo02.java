 package  com.javaintro;

 

 class TestDemo01 {
	
	int StdId;
	String StdName;
	static String SchName;
	static int SchPincode;
	
	static {
		
		System.out.println("Static Block Executed");
		SchName="Prathibha Public School";
		SchPincode=524223;
	}
	{
		System.out.println("Instance Block Executed");
	}
	void Display(){
		
		System.out.println("Student Id: "+StdId);
		System.out.println("Student Name: "+StdName);
		System.out.println("Student School Name: "+SchName);
		System.out.println("Student Pincode: "+ SchPincode);
	}

	public static void main(String[] args) {
		
		System.out.println("Displaying Student Details");
		
		TestDemo01 v1=new TestDemo01();
		v1.StdId=1001;
		v1.StdName="Vamsidhar";
		
		
		TestDemo01 s1=new TestDemo01();
		s1.StdId=1002;
		s1.StdName="RadhaKrishna";
		
		System.out.println("----------First Student Details-------------");
		v1.Display();
		
		System.out.println("--------- Second Student Details-------------");
		s1.Display();
		 
	}

}