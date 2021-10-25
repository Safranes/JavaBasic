package com.neotech.lesson23;

public class Student {
//	Homework 2:
//Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent,SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
// Write example of achieving run time polymorphism
void eat() {
	System.out.println("All the students eat.");
}

void sleep() {
	System.out.println("Students sleep");}
}
class NeotechStudent extends Student{
	void sleep() {
		System.out.println("Neotech students don't sleep"); }
	
	void study() {
		System.out.println("Studying hard!");
	}
}
class CollegeStudent extends Student{
	void sleep() {
		System.out.println("College students sleep all the time ");
	}
	void party() {
		System.out.println("Partying if not sleping");
	}
}
class SchoolStudent extends Student{
	void sleep() {
		System.out.println("School students sleep sometimes ");
	}
	void play() {
		System.out.println("Playing games most of the time");
	}
}