package com.neotech.lesson29;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {
//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Add them randomly in the map.
//	Example:
//	    "France" -> "Paris"
//	    "Kosovo" -> "Prishtina"
//	    "Turkey" -> "Ankara"
//	    "USA" -> "Washington DC"
//	    "Albania" -> "Tirana"
//	    "Italy" -> "Rome"
//
//	    - Print the list and check the order of the countries.
//	    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
//	    - Verify if a specific capital city is in the list ( use containsValue() method )
//	    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
//	    - Get all the values (capital names) in a Collection. Print all capital names using iterator.
	public static void main(String[] args) {
		
		Map<String, String> countries= new TreeMap<>();
		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkey", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		System.out.println(countries);
		
		System.out.println("Does 'countries' map have Turkey? "+countries.containsKey("Turkey"));
		
		System.out.println("Is Rome int this map? "+countries.containsValue("Rome"));

		System.out.println("====Printing countries====");
		
		Set<String> keys=countries.keySet();
		for(String country: keys) {
			System.out.println(country);
		}

		System.out.println("====Printing capitals===");
		Collection<String> capitals=countries.values();
		
		Iterator<String> it=capitals.iterator();
	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
