package com.neotech.lesson16;

import java.util.Scanner;

public class Hw1Of15thClass {
	//HOMEWORK 1-Class15
		// Create a method createEmail(). Based on provided users firstName, lastName
			// and emailType, your method should return complete email address.
			// Example:
			// firstName -> john
			// lastName -> snow
			// emailType -> gmail
			// return -> johnsnow@gmail.com
	String createEmail(String firstName, String lastName, String emailType) {
		String email = firstName + lastName + "@" + emailType + ".com";
		return email;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name!");
		String fName = scan.next();
		
		System.out.println("Please enter your last name!");
		String lName = scan.next();
		
		System.out.println("Please enter your email type!");
		String emailType = scan.next();

		Hw1Of15thClass hw = new Hw1Of15thClass();
		String fullEmail = hw.createEmail(fName, lName, emailType);
		System.out.println("The email is " + fullEmail);

	}
	
}
