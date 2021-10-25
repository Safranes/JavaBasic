package com.neotech.lesson21;

//Homework 3: 
//	Write a Java program called Teacher. Identify features and 
//	behaviour of that Class. Create 3 subclasses MathTeacher, 
//	ChemistryTeacher and PianoTeacher that would have it their 
//	own features and behaviour. Test all 4 classes. 
public class Teacher {

	String firstName;
	String lastName;

	Teacher() {
		System.out.println("Default constructor for Teacher");

	}

	Teacher(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	void teaching() {
		System.out.println(firstName + " " + lastName + " teaching in general");
	}
}

class MathTeacher extends Teacher {
	String field;

	MathTeacher() {
		System.out.println("Default contructor for MathTeacher class");
	}

	MathTeacher(String firstName, String lastName, String field) {
		super(firstName, lastName); // has to be the first line
		this.field = field;
	}

	void teachingMath() {
		System.out.println(firstName + " " + lastName + " teaching Math in the field of "+ field);
	}
}

class ChemistryTeacher extends Teacher {
	String department;

	public ChemistryTeacher() {

		System.out.println("Default contructor for ChemistryTeacher class");
	}

	public ChemistryTeacher(String firstName, String lastName, String department) {
		super(firstName, lastName);
		this.department = department;
	}

	void teachingChemistry() {
		System.out.println(firstName + " " + lastName + " teaching Chemistry in "+department);
	}

}

class PianoTeacher extends Teacher {
	String school;

	public PianoTeacher() {
		System.out.println("Default contructor for PianoTeacher class");
	}

	public PianoTeacher(String firstName, String lastName, String school) {
		super(firstName, lastName);
		this.school = school;
	}

	void teachingPiano() {
		System.out.println(firstName + " " + lastName + " teaching Piano in "+school);
	}

}