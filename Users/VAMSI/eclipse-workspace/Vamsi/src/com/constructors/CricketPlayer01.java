package com.constructors;

import java.util.Scanner;

public class CricketPlayer01 {
	
	String playerName;
	int matches;
	int runs;
	
		CricketPlayer01(){
			this("");
		
	}
		CricketPlayer01(String playerName){
			this(playerName,0); 
		
		
	}
		CricketPlayer01(String playerName,int matches ){
			this(playerName,matches,0);
		
		
	}
		CricketPlayer01(String playerName, int matches,int runs){
		 this.playerName=playerName;
		 this.matches=matches;
		 this.runs=runs;
	
	
}
		void Display() {
			
			double avg=runs/matches;
			
			System.out.println("Player Name is: "+playerName);
			System.out.println("Player Played Matches: "+matches);
			System.out.println("Player total Runs: "+runs);
			System.out.println("Player Avarage: "+avg);
			
		}

	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Player Name: ");
		String name=sc.next();
		
		System.out.println("Enter the Player Matches: ");
		int match=sc.nextInt();
		
		System.out.println("Enter the Player Runs: ");
		int runs=sc.nextInt();
		
		CricketPlayer01 obj=new CricketPlayer01(name,match,runs);
		obj.Display();

	}

}
