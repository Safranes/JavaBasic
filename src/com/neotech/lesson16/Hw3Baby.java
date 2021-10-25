package com.neotech.lesson16;

import java.util.Scanner;

public class Hw3Baby {
//	Homework 3:
//	    Write a program that reads two parent's first names and if they expecting boy or girl?
//	    Based on the input suggests a name for a baby:
//	    If it is a boy get half from dad and half from mom.
//	    If it is a girl get half from mom and half from dad.
//
//	        Example Output:
//	            Mom's first name? Mary
//	            Dad's first name? Daniel
//	            Boy or Girl? boy
//	            Suggested baby name: DANRY
//	        Example Output:
//	            Mom's first name? Mary
//	            Dad's first name? Daniel
//	            Boy or Girl? girl
//	            Suggested baby name: MAIEL
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mother's name.");
		String mother=scan.next();
		System.out.println("Please enter father's name.");
		String father=scan.next();
		System.out.println("What is your baby's gender?boy/girl");
		String gender=scan.next();
//		
//		String babyname="";
//		if(gender.equals("boy")) {
//			babyname=father.substring(0,father.length()/2).concat(mother.substring(mother.length()/2));
//		}else if(gender.equals("girl")) {
//			babyname=mother.substring(0,mother.length()/2).concat(father.substring(father.length()/2));
//		}else {
//			System.out.println("Wrong input");
//		}
//		
//		System.out.println("The name of the baby should be: "+babyname);
//	
		// 2nd way
				if (gender.equalsIgnoreCase("boy")) {
					String fatherFirstHalf = father.substring(0, father.length() / 2);
					String motherSecondHalf = mother.substring(mother.length() / 2);
					String babyName = fatherFirstHalf.concat(motherSecondHalf);
					System.out.println(babyName.toUpperCase());
				} else if (gender.equalsIgnoreCase("girl")) {
					String motherFirstHalf = mother.substring(0, mother.length() / 2);
					String fatherSecondHalf = father.substring(father.length() / 2);
					String babyName = motherFirstHalf.concat(fatherSecondHalf);
					System.out.println(babyName.toUpperCase());
				} else {
					System.out.println("Wrong Entry");
				}

	
	
	
	
	
	
	
	}
	








}
