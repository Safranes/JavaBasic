package com.neotech.lesson22;

public class MathTeacher extends Teacher {
	String field;

	MathTeacher() {
		//super(); is called by default because there is no other parent constructor   
		System.out.println("Default contructor for MathTeacher class");
	}

	MathTeacher(String firstName, String lastName, String field) {
		super(firstName, lastName); // has to be the first line
		this.field = field;
	}
	
	void teachingMath() {
		System.out.println("Teaching Math...");
	}
}
