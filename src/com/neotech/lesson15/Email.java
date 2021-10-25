package com.neotech.lesson15;

import java.util.Scanner;

public class Email {

	//HOMEWORK 1 
	// Create a method createEmail(). Based on provided users firstName, lastName
		// and emailType, your method should return complete email address.
		// Example:
		// firstName -> john
		// lastName -> snow
		// emailType -> gmail
		// return -> johnsnow@gmail.com

	Scanner scan=new Scanner(System.in);


String nameInput() {
	System.out.println("Please enter your name");
	String name = scan.next();
	return name;
	
}

String lastNameInput() {
	System.out.println("Please enter your last name");
	String lastName=scan.next();
	return lastName;
}
String emailTypeInput() {
	System.out.println("Please enter your choice of email type.");
	String emailType=scan.next();
	return emailType;
}
static Email create=new Email();
String completeEmail(String a,String b,String c) {
	String firstName = create.nameInput();
	String lastName=create.lastNameInput();
	String emailType=create.emailTypeInput();
	
	String email=firstName+lastName+emailType+".com";
	return email;
}
public static void main(String[] args) {
	System.out.println(create.completeEmail(null, null, null));
}

}
