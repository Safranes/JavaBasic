package com.neotech.lesson17;

public class Hw1 {

	public static void main(String[] args) {
//		Homework 1:
//Create a String and print it in reverse order (Sunday -> yadnuS). 
//Solve it using charAt(), toCharArray()  and reverse() methods.
//Note:
//for charAt() and toCharArray() use String
//for reverse you have to declare a StringBuffer object
	String day="Sunday";
	
	//Using charAt()
	for(int i=day.length()-1; i>=0; i--) {
		System.out.print(day.charAt(i));
	}
	System.out.println();
	System.out.println("//Using toCharArray()");
char[] c=day.toCharArray();
for(int i=c.length-1; i>=0; i--) {
	System.out.print(c[i]);
}
System.out.println();
System.out.println("Using Reverse method with StringBuffer");
StringBuffer strbfr=new StringBuffer("Sunday");
System.out.println(strbfr.reverse());

	
	
	}

	

}
