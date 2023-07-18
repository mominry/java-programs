package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class BookCricketGame {

	public static void main(String[] args) {
		
		String playerOneName="";
		String playerTwoName="";
		int book=300;
		int score=0;
		int point = -5;
		int round=0;
		int choice=0;
		int bookPage=0;
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to start game and zero to exit");
		choice=sc.nextInt();
		
		while(flag!=false)
		{
		if(choice==1)
		{
		System.out.println("enter player1 name:  ");
		
		playerOneName=sc.next();
		System.out.println("enter player2 name:  ");
		playerTwoName=sc.next();
		
		System.out.println("player 1"+playerOneName);
		Random rand = new Random();
		
		while(point!=0)
		{
			
			System.out.println("enter 1 to open book");
			choice=sc.nextInt();
			if(choice==1)
			{
			bookPage = 1+rand.nextInt(299);
			point =bookPage%7;
			round++;
			score+=point;
			}
			else if(choice==0)
			{
				break;
			}
			else if(point==0)
			{
				System.out.println("--------------oops------------------");
				System.out.println("page number:"+bookPage+"     point:"+point+"     score:"+score);
				System.out.println("total score"+score+"round "+round);
				
				break;
			}
			else
			{
				score+=point;
				
			}
			System.out.println("page number:"+bookPage+"     point:"+point+"     score:"+score);
		
		
		}
		
		System.out.println(playerTwoName+"needs more than"+score+"to win the round");
		// player 2 
		int scoreOfPlayerOne=score;
		int roundOfPlayer1=round;
		score =0;
		//round=0;
		point=-5;
		choice=0;
		while(point!=0)
		{
			if(score>scoreOfPlayerOne&&round>0)
			{
				break;
			}
		
		else
			{
			
			System.out.println("enter 1 to open book");
			choice=sc.nextInt();
				if(choice==1)
				{
					bookPage = 1+rand.nextInt(299);
					point =bookPage%7;
					//round++;
					round--;
				}
				if(choice==0)
				{
					break;
				}
				if(point==0)
				{
					System.out.println("--------------oops------------------");
					System.out.println("page number: "+bookPage+"     point: "+point+"     score: "+score);
					System.out.println("total score"+score+"round l "+round);
					
					break;
				}
				
				else
				{
					score+=point;
					
				}
				System.out.println("page number: "+bookPage+"     point: "+point+"     score: "+score+"     round left: "+round);
			
			
			
			}
		}
		
		if(score<scoreOfPlayerOne)
		{
			System.out.println(playerOneName+"win Match!!!");
			
		}
		else
		{
			System.out.println(playerTwoName+"win Match!!!");
		}
		
		
		
		
		
		}
		else if(choice==0) {
			//exit;
			flag=false;
		}
		else
		{
			System.out.println("enter only 0 or 1");
		}
		}
	}

}


