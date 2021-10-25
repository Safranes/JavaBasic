package com.neotech.lesson10;

public class Task1 {

	public static void main(String[] args) {
		// Print the following pattern
//		55555  // we want the inner loop to run 5 times  --- value of i is 5
//		4444		//                  		 4 times ----value of i is 4
//		333
//		22
//		1

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println();

	}

}
