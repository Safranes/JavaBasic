package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hw2 {

	public static void main(String[] args) {
		//Homework 2:
//	    Create a Set of cities in which you want to make sure that insertion order is maintained. 
//	    Using Iterator remove any city that starts with “A”;
		
		Set<String> cities=new LinkedHashSet<>();
		
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Palm Beach");
		cities.add("Bratislava");
		cities.add("Albany");
		System.out.println(cities);
		
		Iterator<String> it = cities.iterator();
		while(it.hasNext()) {
			String city=it.next();
			if(city.startsWith("A")) {
				it.remove();
			}
		}

		System.out.println(cities);
	}

}
