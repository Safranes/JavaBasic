package com.neotech.lesson10;

import java.util.Scanner;

public class Hw1Lesson10 {

	public static void main(String[] args) {
//		Ask the user to enter an integer and build the following pattern:
//			 *********
//			  *******
//			   *****
//			    ***
//			     *
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer to build a pattern like above!");
		int row=scan.nextInt();
		
		System.out.println("You can see the pattern below");
		 for (int i=row; i>=1; i--)
	        {
			 for(int k=1; k<=2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			 for(int j=row; j>=i; j--) {
				System.out.print(" ");
			}
			
			
		}

		
	}

}
