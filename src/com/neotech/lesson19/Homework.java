package com.neotech.lesson19;
//Create a method that will accept a String as a parameter and return a new String that 
//consist only of vowels. Method should be available inside the class where it was
//declared and executed by calling it is name.
public class Homework {

	private static String vowels(String a) {
		String b ="";
		b=a.replaceAll("[^aeiouAEIOU]", "");
		return b;
		
	}
	public static void main(String[] args) {

		System.out.println(Homework.vowels("AlexDeSouza"));

	

}
}