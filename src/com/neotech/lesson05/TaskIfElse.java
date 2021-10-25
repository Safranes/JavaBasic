package com.neotech.lesson05;

public class TaskIfElse {

	public static void main(String[] args) {
//		Write a program to implement following logic using
//		if-else if-else statement:
//		o if hour is less than 12 noon, greet with Good
//		Morning
//		o if hour is greater than or equal 12 noon but less
//		than 3 pm, greet with Good Afternoon
//		o if hour is greater than or equal to 3 pm, greet with
//		Good Evening
		//using Military Time
		int time=1435;
		if(time<1200) {
			System.out.println("Good morning!");
		}
		else if(time>=1200&time<1500) {
			//you can also write as -> else if(time<1500) because even if time=7->once it meets the condition on line 16,the program will stop there.
			System.out.println("Good Afternoon!");
		}
		else if(time>=1500) {
			System.out.println("Good Evening!");
		}else {
			// you can also type good evening here instead of putting another condition like we did above
			
		}
				

	}

}
