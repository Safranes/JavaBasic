package com.neotech.lesson10;

public class Patterns {
	public static void main(String[] args) {
		
		/*
		 
		 *
		 **
		 ***
		 ****
		 ***** 
		 
		 */

		for(int i=0; i<5; i++) //this will get executed 5 times from 0 1 2 3 4 
		{
			//for i = 0, j goes from 0  to 0 
			for(int k=0; k<=i; k++) //this will execute depending on i
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		/*
		 * 	
		 	******
		 	****
		 	***
		 	**
		 	*
		 	
		 */
		System.out.println("-------");
		for(int j=5; j>0; j--) {
			for(int l=1; l<=j; l++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		
		
		
		
		
	}

}
