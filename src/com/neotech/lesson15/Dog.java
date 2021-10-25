package com.neotech.lesson15;

public class Dog {
	//HW2
	//Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	String name;
	String size;
	String color;
	int age;
	
	void learn() {
		System.out.println(name+" can learn new words to react accordingly.");
	}
	void service() {
		System.out.println(name+" can be a service dog to guide troubled individuals.");
		
	}
	void play() {
		System.out.println(name+" can play with people like a child.");
		
	}

}
