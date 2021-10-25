package com.neotech.lesson29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {
//	Create a map of car models that you have in your garage and for each model the number of car you have.
//	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
//	For example:
//	"BMW" -> 2
//	"Mercedes" -> 3
//	"Audi" -> 3
//	"Ferrari" -> 1
//
//	- Check how many entries you have.
//	- Update the number of Audis to 5.
//	- Add a new model with any number of cars.
//	- Check how many Ferraris you have.
//	- Check if you have Honda in your map.
//	- Remove Mercedes from the map.
//	- Get all models from the map. (use keySet() method)
//
//	Note: After each step print the map.
	public static void main(String[] args) {
	
		Map<String,Integer> cars= new LinkedHashMap<>();
		cars.put("BMW", 2);
		cars.put("Mercedes", 3);
		cars.put("Audi", 3);
		cars.put("Ferrari", 1);
		
		int amount=cars.size();
		System.out.println(amount);
		
		cars.put("Audi", 5);
		System.out.println(cars);
		
		cars.put("Toyota", 7);
		System.out.println(cars);
		
		System.out.println(cars.get("Ferrari"));

		System.out.println(cars.containsKey("Honda"));

		cars.remove("Mercedes");
		System.out.println(cars);
		
		Set<String> models=cars.keySet();
		System.out.println(models);
	}

}
