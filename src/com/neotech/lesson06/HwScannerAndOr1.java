package com.neotech.lesson06;

import java.util.Scanner;

public class HwScannerAndOr1 {

	// Use AND,OR Operator

//1. Prompt the user to enter person heights in inches. Person should be classified as one of the following:
//	• short (under 60 inch)
//	• medium(between 60 -72 inch)
//	• tall (over 72 inch)
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");
		int h = console.nextInt();
		if (h>0&&h < 60) {
			System.out.println("You're short.");
		} else if (h >= 60 && h <= 72) {
			System.out.println("You're medium");
		} else if (h > 72) {
			System.out.println("You're tall");
		} else {
			System.out.println("You don't exist");
		}
	}

}
