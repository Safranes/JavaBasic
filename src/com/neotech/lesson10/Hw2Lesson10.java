package com.neotech.lesson10;

import java.util.Scanner;

public class Hw2Lesson10 {

	public static void main(String[] args) {
//		Ask the user to enter an integer and build the following pattern:
//			1 
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to build a pattern.");
		int num = scan.nextInt();

		System.out.println("You can see the pattern below!");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
