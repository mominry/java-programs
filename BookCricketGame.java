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
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to start game and zero to exit");
		choice=sc.nextInt();
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
		}
		else
		{
			System.out.println("enter only 0 or 1");
		}
		
	}

}


/*

enter 1 to start game and zero to exit
1
enter player1 name:  
rayyan
enter player2 name:  
mark
player 1rayyan
enter 1 to open book
1
page number:208     point:5     score:5
enter 1 to open book
1
page number:159     point:5     score:10
enter 1 to open book
1
page number:177     point:2     score:12
enter 1 to open book
1
page number:59     point:3     score:15
enter 1 to open book
1
page number:261     point:2     score:17
enter 1 to open book
1
page number:262     point:3     score:20
enter 1 to open book
1
page number:213     point:3     score:23
enter 1 to open book
1
page number:142     point:2     score:25
enter 1 to open book
1
page number:229     point:5     score:30
enter 1 to open book
1
page number:19     point:5     score:35
enter 1 to open book
1
page number:223     point:6     score:41
enter 1 to open book
1
page number:267     point:1     score:42
enter 1 to open book
1
page number:110     point:5     score:47
enter 1 to open book
1
page number:193     point:4     score:51
enter 1 to open book
1
page number:241     point:3     score:54
enter 1 to open book
1
page number:269     point:3     score:57
enter 1 to open book
1
page number:8     point:1     score:58
enter 1 to open book
1
page number:283     point:3     score:61
enter 1 to open book
1
page number:298     point:4     score:65
enter 1 to open book
1
page number:209     point:6     score:71
enter 1 to open book

1
page number:267     point:1     score:72
enter 1 to open book
1
page number:285     point:5     score:77
enter 1 to open book
1
page number:36     point:1     score:78
enter 1 to open book
1
page number:103     point:5     score:83
enter 1 to open book
1
page number:56     point:0     score:83
markneeds more than83to win the round
enter 1 to open book
1
page number: 156     point: 2     score: 2     round left: 24
enter 1 to open book
1
page number: 248     point: 3     score: 5     round left: 23
enter 1 to open book
1
page number: 66     point: 3     score: 8     round left: 22
enter 1 to open book
1
page number: 180     point: 5     score: 13     round left: 21
enter 1 to open book
1
page number: 92     point: 1     score: 14     round left: 20
enter 1 to open book
1
page number: 233     point: 2     score: 16     round left: 19
enter 1 to open book
1
page number: 206     point: 3     score: 19     round left: 18
enter 1 to open book
1
page number: 254     point: 2     score: 21     round left: 17
enter 1 to open book
1
page number: 269     point: 3     score: 24     round left: 16
enter 1 to open book
1
--------------oops------------------
page number: 280     point: 0     score: 24
total score24round l 15
rayyanwin Match!!!







*/