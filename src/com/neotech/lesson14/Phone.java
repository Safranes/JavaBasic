package com.neotech.lesson14;

public class Phone {
	//HW1-Create a Class “Phone”. 
	//Create 3 Objects of it: iPhone, Android, Nokia 
	//with specific  attributes and behaviors.
	//attributes
	String color;
	String brand;
	String model;
	int    ram;
	//behaviors
	void call() {
		System.out.println(brand+" "+model + " can make a call.");
	}
	void text() {
		System.out.println(brand+" "+model+" can send a text message.");
	}
	void record() {
		System.out.println(brand+" "+model+" can record a video.");
	}
	
}
