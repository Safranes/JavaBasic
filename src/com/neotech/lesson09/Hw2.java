package com.neotech.lesson09;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
//		Create a program that will be asking user to apply for a credit card 10 times.
//		As soon you get an "yes" from a user program should stop asking.

		Scanner scan=new Scanner(System.in);
	
	for(int i=1; i<=10; i++) {
		System.out.println("Would you like to apply for a credit card? yes or no");
		String answer=scan.nextLine();
		if(answer.equals("yes")) {
			break;
		}
	}
	
//	OR YOU CAN DECLARE THE STRING FIRST THEN SCAN IN THE LOOP AND ALSO YOU CAN USE "Ignore case"
//	String input; 
//	
//	
//	for (int i = 0; i < 10; i++)
//	{
//		System.out.println("Do you want to apply for a credit card??");
//		input = scan.next();
//		
//		if(input.equalsIgnoreCase("yes"))
//		{
//			System.out.println("Great!");
//			break;
//		}	
//		
//	}
	
	}

}
