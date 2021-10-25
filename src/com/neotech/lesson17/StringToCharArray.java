package com.neotech.lesson17;

public class StringToCharArray {

	public static void main(String[] args) {
		// toCharArray()-->Will get the string and split it every character and return it into a char array!!
		String str = "Today is Thursday and I have Java class";
		char[] charArray=str.toCharArray();
		
		for (char c: charArray) {
			System.out.print(c);
		}
		System.out.println();
		//Length is same it is proving that toCharArray() method 
		//getting 17 letters (characters) from the string and putting them in to an array of char
		System.out.println("The length of the string is "+str.length());
		System.out.println("The lengt of the char array is "+charArray.length);

		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("====HOMEWORK===");
		// Homework
		// yadoT si yadsruhT dna I evah avaJ ssalc
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
