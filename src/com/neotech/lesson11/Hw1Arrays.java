package com.neotech.lesson11;

public class Hw1Arrays {

	public static void main(String[] args) {
//Homework 1: Create an array of cars and store 6 elements into it. Print all values from the array.

		String[] cars= {"Ferrari", "Tesla","Toyota", "Honda", "Chevrolet", "Audi"};
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
	}

}
