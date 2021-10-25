package com.neotech.lesson23;

public class FinalExample {

	// instance variable
	final String str = "I love Java!!";

	final void printVariable() {
		System.out.println(str);
	}

	public static void main(String[] args) {

		FinalExample fe = new FinalExample();
		// fe.str="I don't like Java";//final variable cannot be changed

		fe.printVariable();
		
	}
}

class ChildClass extends FinalExample
{
	String str="Child Class";//We are just creating a local variable not reassigning
	
	//Compiler Error: You cannot override a final method!
//	void printVariable()
//	{
//		System.out.println(this.str);
//	}
	
	//	THIS  is a different method
	void printVariable(int num) 
	{
		
	}
	
}
