package com.neotech.lesson26;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
//		Create a generic ArrayList that will store 5 names into it.
//		▪ Find out whether the given ArrayList is empty or not?
//		▪ Check whether the specific name is present in an
//		ArrayList or not?
//		▪ Find the size of your arrayList and print all values from
//		that
		
		
		ArrayList<String> names= new ArrayList<>();
		
		names.add("Alex");
		names.add("Enes");
		names.add("Jose");
		names.add("Jack");
		names.add("Don");
		
		boolean empty=names.isEmpty();
		boolean isThere=names.contains("Aras");
		int size=names.size();
		
		System.out.println("Is the names Array List empty: "+empty);
		System.out.println("Is there a name as Aras in it? "+isThere);
		System.out.println("Size of the names Array List is: "+size);
		System.out.println(names);
		
		for(String name: names) {
			
			System.out.println(name);
		}
		
	}

}
