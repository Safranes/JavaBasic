package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// Ask a user: Guess the number
		//Lucky number is 7
		//As long as the entered number is not 7 we need keep asking for trying
		//Once number is correct-->"You're winner"
		

		Scanner scan=new Scanner(System.in);
		int number;

		// Using While loop
		//
		// System.out.println("Guess the number");
		// number = scan.nextInt();
		//
		// while (number != 7) {
		// System.out.println("Guess the number");
		// number = scan.nextInt();
		// }
		//
		// System.out.println("You're a winner");

		// In this example, using do-while loop is better
		do {
			System.out.println("Guess the number");
			number = scan.nextInt();
		}while(number!=7);
			
		
		System.out.println("You're a winner");
	}

}
