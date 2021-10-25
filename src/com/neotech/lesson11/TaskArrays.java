package com.neotech.lesson11;

public class TaskArrays {

//	1. Create an array of chars and store grades into it: A,B,C,D,E,F.
//	Then print a grade B (use 2 different ways of creating an array).
//	2. Create an array of words: Java, Saturday, day, coding, is.
//	Print the following sentence using elements of array:
//	“Saturday is Java coding Day”.
	
	public static void main(String[] args) {
		//TASK 1
char[] grades=new char[6];

	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
	System.out.println("Your grade is: "+grades[1]);
	System.out.println("----2nd way-----");
	char[] grades2={
		'A','B','C','D','E','F'
		
	};
	
	System.out.println("Your grade is: "+grades2[1]);
	
	System.out.println("====TASK 2=====");
	String[] words= { "Java","Saturday", "day","coding", "is"};
System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	
	}
	}
