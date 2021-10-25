package com.neotech.lesson17;

public class Hw2 {

	public static void main(String[] args) {
//		Homework 2:
//Write a program to print out the following conversion:
//Today is Tuesday and we have a Java Class!!!  to 
//yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		String str = "Today is Thursday and I have Java class!!!";
		
		String [] result =str.split(" ");
		for(String word: result) {
			char[] s=word.toCharArray();
			for (int i=s.length-1; i>=0; i--) {
				System.out.print(s[i]);
			}
			System.out.print(" ");
		}
	}

}
