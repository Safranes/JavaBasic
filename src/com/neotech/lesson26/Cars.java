package com.neotech.lesson26;

import java.util.ArrayList;

public class Cars {
public static void main(String[] args) {
	ArrayList<String> cars=new ArrayList<>();

	cars.add("Toyota"); 
	cars.add("Bentley");
	cars.add("BMW");
	cars.add("Mazda");
	cars.add("Honda");
	
	System.out.println("Using enhanced for loop");
	for(String el: cars) {
		
		System.out.println(el);
	}
	System.out.println("Using regular for loop");
	for(int i=0; i<cars.size(); i++) {
		System.out.println(cars.get(i));
	}
}
}
