package Vamsi;

public class Employee {
	static String CmpName;
	static String EmpLocation;
	int EmpSalary;
	String EmpName;
	static{
		System.out.println("Static block executed");
		CmpName="Google";
		EmpLocation="Hyderbad";
	}
	
		{
		
			System.out.println("Instance Block Executed");
	}
     void Display() {
    	System.out.println("Employee Empname: " + EmpName);
 		System.out.println("Employee Salary: " + EmpSalary);
 		System.out.println("Employee Company Name: " + CmpName);
 		System.out.println("Employee Location: " + EmpLocation);
 	
     }
    	 
              public static void main(String[] args) {
            	  
            	  
            	  Employee s1=new Employee();
            	  s1.EmpSalary=90000;
            	  s1.EmpName="Vishal";
            	  
            			  
            	  Employee v1=new Employee();
            	  v1.EmpName="Vishnu";
            	  v1.EmpSalary=30000;
            	  
            	  
            System.out.println("Employee 1 Details");
            s1.Display();
            System.out.println("Employee 2 Details");
            v1.Display();
                       
              
     }
		 
}
