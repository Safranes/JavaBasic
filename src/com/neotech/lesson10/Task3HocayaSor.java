package com.neotech.lesson10;

public class Task3HocayaSor {

	public static void main(String[] args) {
		/*
		 
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
			 
			 */

		for (int row = 1; row <= 5; row++)// this loop will be responsible to add rows
		{
			for (int col = 5; col > row; col--) // this loop will add spaces before printing stars
			{
				System.out.print(" ");
			}
			for (int col2 = 1; col2 <= row; col2++)// this loop will add stars also with spaces in the shape of the
													// pyramid
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
