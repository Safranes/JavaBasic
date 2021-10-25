package com.neotech.lesson21;

public class Student {
//	HOMEWORK1&3 OF CLASS 20!!
	//Write program as a Student class that has instance variables name and address. Create a constructor that will initialize
//those variables. Print name & address of given student using displayInfo method.
	String name;
	String address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
		
	}
//	static Student(){
//		
//	}-->CE: You cannot create a static constructor! only public, protected and private
	
	void displayInfo(){
		System.out.println("The name of the student is "+ name+" and address is "+ address);
	}
	
	public static void main(String[] args) {
		Student s1=new Student("Enes", "123 cc st");
		s1.displayInfo();
	}
	
	
}
