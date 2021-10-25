package com.neotech.lesson29;

import java.util.HashMap;

public class Task {
	public static void main(String[] args) {
		
		/*
		 * Create a map of a building. Store floor number and it is
		 * associated company name. (Example: 1=Google, 2=Apple,
		 * 3=Neotech etc..). Insert 7 entries with duplicate keys and values.
		 * 	Check how many entries you have?
		 * 	Update company on a 4th floor
		 * Remove company on the 7th floor
		 * Print your map
		 * 
		 */
		
		HashMap<Integer, String> building=new HashMap<>();
		
		building.put(1, "Lenovo");
		building.put(2, "Apple");
		building.put(3, "Monster");
		building.put(4, "HP");
		building.put(4, "Acer");
		building.put(6, "LG");
		building.put(7, "LG");
		
		System.out.println(building.size());
		
		building.replace(4, "Ferrari");
		building.remove(7);
		System.out.println(building);
		
		
	}

}
