package com.neotech.lesson26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		int[] numbers = new int[4]; // creates an array of size 4, which we cannot change

		ArrayList<String> names = new ArrayList<>();
		int size = names.size(); // size method returns the length of the ArrayList object

		System.out.println("Size: " + size);

		names.add("Evis");
		names.add("Mehmet");
		names.add("Komron");
		names.add("Murat");

		System.out.println("The new size: " + names.size());

		System.out.println(names);

		// remove element
		names.remove("Komron");
		System.out.println(names);

		String name = names.get(1);
		System.out.println(name);

		System.out.println("Iterating the ArrayList with for loop");

		for (int i = 0; i < names.size(); i++) {
			String element = names.get(i);
			System.out.println(element);
	}

		System.out.println("Iterating the ArrayList with an enhanced/for each loop:");
		
		for(String element:names)
		{
		System.out.println(element);	
		}
		
	}

}
