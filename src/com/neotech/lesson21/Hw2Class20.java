package com.neotech.lesson21;

public class Hw2Class20 {
//Homework 2:
//  Write a program that will have 4 different access levels of constructors and create 3 objects of this class:
//1 -inside same class;
//2 -from outside the class; 
//3 -from different class inside different package and observe result.
	  String a;
	private Hw2Class20() {
System.out.println("This constructor can be accessed only within this class.");
	}
	
	protected Hw2Class20(String a) {
		System.out.println(a);
	}
	
	public Hw2Class20(int b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
Hw2Class20 prvtCnstrctr=new Hw2Class20();
	}
}
