package com.aurionpro.test;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		
		int[][] array1={{6,8,7},{5,3,2},{1,2,6}};
		int[][] array2={{1,2,6},{5,3,2},{1,2,6}};
		
		int[][] answer= new int[3][3];
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=0;
				for(int k=0;k<3;k++)
				{
					sum=sum+array1[i][k]*array2[k][j];
					answer[i][j]=sum;
					
				}
				
				
			}
			
			
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(answer[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}


/*output of the above program
53 50 94  
22 23 48  
17 20 46  





*/