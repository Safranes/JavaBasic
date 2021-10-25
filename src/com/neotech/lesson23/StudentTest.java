package com.neotech.lesson23;

public class StudentTest {
public static void main(String[] args) {
	
	Student st=new Student();
	Student nt=new NeotechStudent();
	Student cs=new CollegeStudent();
	Student ss=new SchoolStudent();
	
	st.eat();
	st.sleep();//Run time polymorphism achieved by overriding 
	nt.sleep();//Run time polymorphism achieved by overriding 
	cs.sleep();//Run time polymorphism achieved by overriding 
	ss.sleep();//Run time polymorphism achieved by overriding 
	
	
}
}
