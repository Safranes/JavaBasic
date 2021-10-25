package com.neotech.lesson05;

public class Task1NestedIf {
//We chose this example to use nested if.
	public static void main(String[] args) {
//		Write a java program to check if a patient has allergies. If the
//		patient does not have allergies print “You’re healthy!”. If the
//		patient has allergies, check if it is a peanut allergy, lactose
//		allergy, bee allergy or seafood allergy and print a statement telling
//		the patient “Don’t eat ___”. (fill the line with the food names –
//		peanut, seafood etc.)

		boolean allergy = true;

		boolean peanut = false;
		boolean lactose = true;
		boolean bee = true;
		boolean seafood = true;

		if (allergy) {
			if (peanut) {
				System.out.println("Don't eat peanut");
			} else {
				System.out.println("You can eat Peanut!");// just to show that you can add else here as well
			}
			if (lactose) {
				System.out.println("Don't eat lactose ");
			}
			if (bee) {
				System.out.println("Don't eat honey!");
			}
			if (seafood) {
				System.out.println("Don't eat seafood");
			}
		} else {
			System.out.println("You are healthy!");
		}
	}
}
