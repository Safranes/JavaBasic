package com.neotech.lesson28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw1 {

	public static void main(String[] args) {
//	Homework 1:
//	  Create a Set collection in which you need to add names of the countries. 
//	  In this set we want all objects to be sorted in alphabetical order. 
//	  Using 2 different ways retrieve all elements from set.
		
		Set<String> countries= new TreeSet<>();
		countries.add("Turkiye");
		countries.add("USA");
		countries.add("Albania");
		countries.add("Hungary");
		System.out.println(countries);
		
		System.out.println("--Using Iterator--");
		
		Iterator<String> it = countries.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--Using Enhanced For Loop--");
		for(String country:countries) {
			System.out.println(country);
		}
	}

}
