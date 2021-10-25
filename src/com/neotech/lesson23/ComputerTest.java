package com.neotech.lesson23;

public class ComputerTest {
public static void main(String[] args) {
//	Homework 3: 
//	    Create a Class Computer that will have 4 subclasses as Apple, Lenovo,
//	HP, Dell. Define common behavior within and some fields in parent class
//and override some of the methods in child classes
//	 Define some methods specific to child classes
//	 Create objects of child classes and store them into array. Loop through 
//	 each object and execute available methods.
	Computer[] computer=new Computer[5];
	computer[0]=new Computer(0,0);
	computer[1]=new Apple(8,256);
	computer[2]=new Lenovo(16,512);
	computer[3]=new HP(6,128);
	computer[4]=new Dell(16,512);
	//Apple apple=(Apple) computer[1]; //Downcasting so we can use specific child methods
	//!!!Java review 07 package world class has the explanation how you can solve this under safe downcasting!!
	for(Computer power:computer) {
		power.specs();

}




}
}
