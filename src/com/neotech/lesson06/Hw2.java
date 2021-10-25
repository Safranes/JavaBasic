package com.neotech.lesson06;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. If they
		// are 18 and older you will issue a driver licence to them, otherwise you will
		// offer them to get a learners permit.

		Scanner ask=new Scanner(System.in);
		
		System.out.println("Please enter your age.");
		int age=ask.nextInt();
		if(age>=18) {
			System.out.println("You can have a driver licence!");
		}else {
			System.out.println("You may apply for learners permit.");
		}
		
	}
}
