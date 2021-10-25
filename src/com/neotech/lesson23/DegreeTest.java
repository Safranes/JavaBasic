package com.neotech.lesson23;

public class DegreeTest {
// Call the method by creating an object
//	of each of the three classes.
	public static void main(String[] args) {
		
		Degree dg=new Degree();
		
		dg.getPrerequisite();//calling the method of Degree class
		
		Bachelors bc = new Bachelors();
		bc.getPrerequisite();//calling the method of Degree class
		
		//this is where the overriding happens
		Masters ms=new Masters();
		
		ms.getPrerequisite();//Calling method of masters class
		
		
	}
	
}
