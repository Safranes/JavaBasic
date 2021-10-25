package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw1_Lesson27 {
//	Homework 1:
//	    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("Pepsi");
		drinks.add("coke");
		drinks.add("gin");
		drinks.add("ayran");

		for (int i = 0; i < drinks.size(); i++) {

			if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
				// You are updating an element at a specific index/position
				drinks.set(i, "water");
			}

		}

		System.out.println(drinks);

	}

}