package com.neotech.lesson03;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5 
		 * and height = 8. Your program should say. 
		 * "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and 
		 * the area is __"
		 * 
		 */
		//declare variables: h and w;
		//declare perimeter and area variables
		// calculate perimeter
		//calculate area
		//print the sentence
		
		int w=5;
		int h=8;
		
		int perimeter=2*(w+h);
		int area=h*w;
		
		System.out.println("The perimeter of a rectangle with width "+ w+ " and height "+ h+" is equal to "+ perimeter+" and"+ " the area is "+ area+".");

	}

}
