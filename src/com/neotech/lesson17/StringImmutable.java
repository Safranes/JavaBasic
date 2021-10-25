package com.neotech.lesson17;

public class StringImmutable {
//Strings are immutable--> not changeable meaning-->String is immutable means that you cannot change the object itself, but you can change the reference
//to the object. When you execute a = "ty" , you are actually changing the reference of a to a new object created 		
//by the String literal "ty"
	public static void main(String[] args) {
		String str = "Hello";
		str.concat(" World");
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);

	}
	
}
