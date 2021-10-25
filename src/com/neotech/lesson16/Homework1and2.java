package com.neotech.lesson16;

public class Homework1and2 {

	public static void main(String[] args) {
//		Homework 1:
//		    Create a String that will hold a sentence. Write a program to get a new String without any spaces.


	
	String sentence="I am learning String manipulations.";
	
	String newSentence=sentence.replaceAll(" ", "");
	
	System.out.println(newSentence);
	

//	Homework 2:
//    Create a String that should be combination of letters, numbers and special characters. 
	//Find out how many alpha characters are there in the String. (alpha characters means letters)
	
	String combination="Catch#me^if%you$can!1234";
	
	String newCombination=combination.replaceAll("[^a-zA-Z]", "");
			int length=newCombination.length();
			System.out.println("There are "+length+" alpha characters.");
			
			//Just for exercise to see how we can keep only numbers or special characters
			System.out.println("Let's keep the numbers");
			String str=combination.replaceAll("[^0-9]", "");
			System.out.println(str);
			
			System.out.println("Let's keep the special characters");
			String str1=combination.replaceAll("[0-9a-zA-z]", "");
			System.out.println(str1);
			
			//"a-z" or "[az] are not regular expressions
	
	}

}
