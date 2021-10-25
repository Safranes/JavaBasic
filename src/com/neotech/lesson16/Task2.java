package com.neotech.lesson16;

public class Task2 {
	// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
	public static void main(String[] args) {
		
	
	String sa=new String("Safrane");
	if(!sa.isEmpty()) {
	
		int length=sa.length();
		
		if(sa.length()%2==1 && sa.length()>3) {
		char middle=sa.charAt(length/2);
	System.out.println(middle);
		}
		else {
			System.out.println("The condition is not true");
		}
	
	}else {
		System.out.println("The string is empty");
	}
	}
	
}
