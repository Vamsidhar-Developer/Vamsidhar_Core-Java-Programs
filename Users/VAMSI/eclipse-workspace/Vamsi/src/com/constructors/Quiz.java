package com.constructors;

public class Quiz {
	
	String subject;
	int totalQuestions;
	int timeLimit;
	
	
	Quiz(){
	this("Java Full Stack");
	System.out.println("No Args Constructor");
	}
	
	 Quiz(String subject){
		this(subject,20);
		System.out.println("One Args Constructor");
	}
	 
	Quiz(String subject,int totalQuestions){
		this(subject,totalQuestions,30);
		System.out.println("Two Args Constructor");
	}
	
	Quiz(String subject,int totalQuestions,int timeLimit){
		this.subject=subject;
		this.totalQuestions=totalQuestions;
		this.timeLimit=timeLimit;
		System.out.println("Three Args Constructor");
		
		
	}
	void display()
	{
		System.out.println("Subject Name: "+subject);
		System.out.println("Total Questions:"+totalQuestions);
		System.out.println("Time Limit:"+timeLimit);
			 	
	}
	

	public static void main(String[] args) {
		 
		Quiz obj=new Quiz();
		obj.display();
		

	}

}
