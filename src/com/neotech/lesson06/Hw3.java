package com.neotech.lesson06;

import java.util.Scanner;

public class Hw3 {

	// Create a Java program that will ask user to input city and temperature. Your
	// program should convert Fahrenheit into celsius and print “The temperature is
	// the city __ is __”
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your city name.");
		String city=input.nextLine();
		System.out.println("Please enter the temperature.");
		int temp=input.nextInt();
		
		int tempCelsius=(temp-32)*5/9;
		System.out.println("The temperature in the city of "+city+" is "+tempCelsius+"degrees");
		
		
	}
	
	
}
