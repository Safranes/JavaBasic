package com.neotech.lesson10;

public class EasyPatterns {

	public static void main(String[] args) {
		// EXPLANATION FOR WHY NESTED LOOPS ARE SO HELPFUL AND IMPORTANT

		// *****
		// ****
		// ***
		// **
		// *

		// AS YOU CAN SEE BELOW!!
		// WE HAVE TO DEAL WITH MANY LOOPS IF WE DONT USE NESTED LOOPS

		for (int j = 0; j < 5; j++) // this loops 5 times
		{
			System.out.print("*");
		}

		System.out.println();

		for (int j = 0; j < 4; j++) // this loops 4 times
		{
			System.out.print("*");
		}

		System.out.println();

		for (int j = 0; j < 3; j++) // this loops 3 times
		{
			System.out.print("*");
		}

		System.out.println();

		for (int j = 0; j < 2; j++) // this loops 2 times
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.println("*");

		//USING NESTED LOOP*****************!!!!!!!!!
		for (int row = 5; row > 0; row--) {

			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
