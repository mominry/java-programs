package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class pig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		int dice=0;
		int turn=1;
		String choice;
		
		while(score<20)
		{
			Random rand = new Random();
			Scanner sc=new Scanner(System.in);
			System.out.println("Turn"+turn);
			System.out.println("enter choice r or h");
			choice=sc.next();
				if(choice.equalsIgnoreCase("r"))
				{
					dice=1+rand.nextInt(5);
					System.out.println("dice :"+dice);
					if(dice!=1) {
						score+=dice;	
					}
					else if(dice==1)
					{
						turn++;
						score=0;
						System.out.println("No score");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("turn"+turn);
						
					}
					
					
					
				}
				else if(choice.equalsIgnoreCase("h"))
				{
					turn++;
					System.out.println("your score for turn"+score);
					System.out.println(" ");
					System.out.println(" ");
					//System.out.println("Turn"+turn);
					
					
				}
			
			
		}
		
		System.out.println("you finished in "+turn+"turns");
		
	}

}


/*
output:
Turn1
enter choice r or h
r
dice :5
Turn1
enter choice r or h
h
your score for turn5
 
 
Turn2
enter choice r or h
r
dice :3
Turn2
enter choice r or h
r
dice :4
Turn2
enter choice r or h
r
dice :5
Turn2
enter choice r or h
r
dice :1
No score
 
 
turn3
Turn3
enter choice r or h
r
dice :1
No score
 
 
turn4
Turn4
enter choice r or h
r
dice :4
Turn4
enter choice r or h
r
dice :1
No score
 
 
turn5
Turn5
enter choice r or h
r
dice :3
Turn5
enter choice r or h
r
dice :3
Turn5
enter choice r or h
r
dice :1
No score
 
 
turn6
Turn6
enter choice r or h
r
dice :4
Turn6
enter choice r or h
r
dice :3
Turn6
enter choice r or h
r
dice :5
Turn6
enter choice r or h
r
dice :4
Turn6
enter choice r or h
r
dice :4
you finished in 6turns






*/
