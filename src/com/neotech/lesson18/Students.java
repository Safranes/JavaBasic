package com.neotech.lesson18;
//HOMEWORK
//Create a Class called Students 
//▪ Create three variables studentName, studentID and numberOfStudents
//▪ Create three objects of the Students Class
//▪ Set the value for studentName , studentID and increment
//the numberOfStudents for each object
//▪ Print out total number of students

public class Students {

	String Name;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {

		Students st1 = new Students();
		st1.Name = "Jack";
		st1.studentID = 123;
		Students.numberOfStudents++;

		Students st2 = new Students();
		st2.Name = "Bob";
		st2.studentID = 45;
		Students.numberOfStudents++;

		Students st3 = new Students();
		st3.Name = "Chris";
		st3.studentID = 78;
		Students.numberOfStudents++;

		System.out.println("Total number of students is " + numberOfStudents);

	}
}
