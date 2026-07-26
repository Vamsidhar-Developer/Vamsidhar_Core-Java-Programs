package com.constructors;

import java.util.Scanner;
 
		class CricketPlayer{
			String pname;
			int matches;
		    double totalRuns;
			
			CricketPlayer(String name,int match,double tr){
				
				pname=name;
				matches=match;
				totalRuns=tr;
				
			}
			void show() {
				
				double avg=totalRuns/matches;
				
				System.out.println("Player Name: "+pname);
				System.out.println("Player Played Matches: "+matches);
				System.out.println("Player Runs: "+totalRuns);
				System.out.println("Player Average: "+avg);
				
			}
			
			public static void main(String []args) {
				
				
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Player Name: ");
				String name=sc.next();
				System.out.println("Enter Player Matches: ");
				int match=sc.nextInt();
				System.out.println("Enter Player Runs: ");
				double runs=sc.nextDouble();
				
				CricketPlayer player=new CricketPlayer (name,match,runs);
				
				player.show();
				sc.close();
				
				
			}
		}