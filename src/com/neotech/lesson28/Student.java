package com.neotech.lesson28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {

	String name;
	int studentID;
	
	Student(String name, int studentID){
		this.name = name;
		this.studentID = studentID;
	}
	
	public void printName() {
		System.out.println(name);
	}
	public static void main(String[] args) {
//		Homework 3:
//		Create a Set collection that will hold Objects of Student Type. 
//		In this set we do not care about the insertion order. 
//		Each student object should have name and studentID. Display name of each student.
		
		Set<Student> students=new HashSet<>();
		students.add(new Student("Ali",123));
		students.add(new Student("Veli", 1234));
		students.add(new Student("Hasan", 5346));
		
		Iterator<Student> it= students.iterator();
		
		while(it.hasNext()) {
			Student student=it.next();
			student.printName();
		}
		
		
	}

}
