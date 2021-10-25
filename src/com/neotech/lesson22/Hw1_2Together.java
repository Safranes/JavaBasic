package com.neotech.lesson22;

public class Hw1_2Together {
//	Homework 1:
//	    Create 1 class with 3 overloaded static methods. Then call each 
//	overloaded methods with specific arguments and observe the results.  
//	Homework 2:
//	    Create a class with 3 overloaded private methods. Then call each 
//	overloaded methods with specific arguments and observe the results.

	private static void perimeter(int a) {
		System.out.println("The perimeter of the square is: " + (4 * a));
	}

	private static void perimeter(int a, int b) {
		System.out.println("The perimeter of the rectangle is: " + 2 * (a + b));
	}

	private static void perimeter(double π, double r) {
		System.out.println("The perimeter of the circle is: " + 2 * π * r);
	}

	public static void main(String[] args) {
		perimeter(3);
		perimeter(4, 9);
		perimeter(3.14, 2.5);
	}

}
