package com.neotech.lesson08;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {

		// Write a program that asks user to enter his/her username and password until
		// user enters them correctly.
		Scanner scan = new Scanner(System.in);
		
		String userName;
		int password;
		
		do {
			System.out.println("Please enter your username");
			userName = scan.next();
			System.out.println("Please enter your password");
			password = scan.nextInt();
		} while (!userName.equals("Alex") || password != 20202020);

		System.out.println("Your login successfull!");
	}

}
