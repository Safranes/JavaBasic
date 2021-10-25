package com.neotech.lesson05;

public class InterviewQuestion {

	public static void main(String[] args) {
		//write a java program to check whether number is Even or Odd.
		
		int number=5;
		
		//1st my way
		if(number%2==0) {
			System.out.println("Number  is even");
	}else {
		System.out.println("Number is odd");
	}
		//2nd way
		int remainder=number%2;
		if(remainder==1) {
			System.out.println("Number is odd");
		}else {
			System.out.println("Number is even");
		}
		//3rd way
		if (remainder == 0) {
			System.out.println("This is an even number!");
		} else {
			System.out.println("This is an odd number!");
		}
		// 4th way
		if (number % 2 == 1) {
			System.out.println("This is an odd number!");
		} else {
			System.out.println("This is an even number!");
		}

	}

}
