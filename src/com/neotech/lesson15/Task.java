package com.neotech.lesson15;

public class Task {

	/*
	 * Create a method that will take 2 parameters as numbers and prints which
	 * number is larger. Create a method that will take a number and prints whether
	 * the number is even or odd. Create a method that will say Hello in different
	 * language based on the country that will passed when method is executed.
	 */
//Create a method that will take 2 parameters as numbers and prints which number is larger.
	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("Numbers are equal");
		}
	}
//Create a method that will take a number and prints whether the number is even or odd.

	void evenOdd(int c) {
		if (c % 2 == 0) {
			System.out.println(c + " is an even number.");
		} else {
			System.out.println(c + " is an odd number.");
		}

	}
//Create a method that will say Hello in different language based on the country that will passed when method is executed.

	void sayHello(String country) {
		switch(country) {
		case "Albania":
			System.out.println("Pershendetje");
			break;
		case "Turkey":
			System.out.println("Merhaba");
			break;
		case "Uzbekistan":
			System.out.println("Salom");
			break;
		case "Mexico":
			System.out.println("Hola");
			break;
		case "Tajikistan":
			System.out.println("Salom");
			break;
		default:
			System.out.println("I don't know "+country);
			break;
		}
	}
	
	public static void main(String[] args) {
		Task t=new Task();
		
		t.larger(5, 3);
		t.larger(2, 6);
		t.larger(4, 4);
		
		System.out.println();
		
		t.evenOdd(324);
		
		System.out.println();
		
		t.sayHello("Turkey");
		t.sayHello("France");
		t.sayHello("Mexico");
		
		
		
	}

}
