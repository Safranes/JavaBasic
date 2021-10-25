package com.neotech.lesson17;

public class StringComparison {
public static void main(String[] args) {
	
	String str1="Hello";
	String str2= new String("Hello");
	
	if(str1.equals(str2)) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are not equal");
	}
	
	System.out.println("-------Comparing using == operator-----");
	if(str1==str2) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are not equal");
	}
	
	System.out.println("---Comparing str1==str3---");
	
	String str3="Hello";
	if(str1==str3) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are not equal");
	}
	
	//Class video is explaining at 1:53--> how literal Strings(Primitive data types) and objects of Strings are stored in different places in the memory
//	That is why str1==str2 is false but str1.equals(str2) is true because .equals is checking the value stored inside str2
	//That is why always suggested use---.equals() method not the == operator. 
	
}
}
