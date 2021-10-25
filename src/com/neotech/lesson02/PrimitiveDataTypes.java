package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		//There are 8 primitive data types in Java
		//to store whole numbers-->byte, short, int, long

		byte var1=-15; //the range is -128 to 127,so can store total of 256 different values
		
	//byte var2=130;-->compiler will give an error because 130 is not in the range of byte is able to store
		short varShort=130; //the range is -32768 to 32767
		
		//short varShort2=3.5;->compiler will give an error because I cannot store a decimal into a short
		
		//int var1=76456;->compiler-error,because I have already used var1 as an identifier
		
		int enes=76456; //the range is more than -2 billion to more than 2 billion
		int var4=15; // Ican store a small number as well
		
		//if the number is greater than 2 billion, you have to use long and put L or l at the end
		long number=78437634934L;
		
		//to store decimal numbers--> can use float, double
		float number2=234.123456789012f;//you must use f or F and can print only 5 digits after the decimal
		double number3=234.123456789012;//when you use double, you don't need F at the end and can store a lot more digits after the decimal 
		
		System.out.println(number2);
		System.out.println(number3);
		
		//to store one single character--> char
		
		char var5='k';
		char var6='K';
		char var7='$';
		char var8=' '; // this is a space character
		char var9='9';
		
		System.out.println(var7);
		
		// to store boolean values (true/false)
				boolean b = true;

				// I cannot use public as a variable name, because it as a special keyword
				// int public = 5;
		
		
	}

}
