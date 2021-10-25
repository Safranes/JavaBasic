package com.neotech.lesson06;

import java.util.Scanner;

public class TasksScanner {

	public static void main(String[] args) {
//		1. Write a program that asks user to enter first name and then last name. At the end system should display user’s full name.
//		2. Write a program that calculates the sum of two numbers entered by the user.
//		3. Write a program that asks user to enter two numbers and prints which one is larger.
		// 1.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name.");
		String name = input.next();
		System.out.println("Please enter your last name.");
		String lastName = input.next();

		System.out.println(name + " " + lastName);
		//2.
		System.out.println("Please enter a number");
		int number=input.nextInt();
		System.out.println("Please enter another number");
		int number2=input.nextInt();
		System.out.println("The sum of these 2 numbers is "+(number+number2));
		//3.
		System.out.println("Please enter a number");
		int number3=input.nextInt();
		System.out.println("Please enter another number");
		int number4=input.nextInt();
		
		if(number3>number4) {
			System.out.println(number3+" is larger than "+number4);
		}else if(number4>number3) {
			System.out.println(number4+" is larger than "+number3);
		}else {
			System.out.println("Numbers are equal");
		}
	
	}

}
