package com.neotech.lesson13;

public class Hw2_InterviewQuestion {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] num = { 1, 5, 7, 9 };
		int largest = num[0];
		int smallest = num[0];
		int secondLargest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (largest < num[i]) {
				largest = num[i];
			} else if (smallest > num[i]) {
				smallest = num[i];
			}

		}
		for (int i = 0; i < num.length; i++) {
			if (secondLargest < num[i] && num[i] < largest) {
				secondLargest = num[i];
			}
		}

		System.out.println("Largest number in the array is " + largest);
		System.out.println("Second Largest number in the array is " + secondLargest);
		System.out.println("Smallest number in the array is " + smallest);
		
		//SABAH'S SOLUTION in 1 LOOP ONLY!!
		
//		int[] numbers = { 32, 61, 16, 89, 74, 25 };
//		
//		int[] numbers2 = { 1, 110, -1, 90, 16, 89, 74, 89, 25, 100};
//		int smallest = numbers[0];
//		int largest = 0;
//		int largest2 = 0;
//		for (int i = 0; i < numbers2.length; i++) {
//			int element = numbers2[i];
//			// check if it is bigger than the largest
//			if (element > largest) {
//				largest2 = largest;
//				largest = element;
//			} else if (element > largest2 && element!=largest) { // check if it is bigger than second largest
//				largest2 = element;
//			}
//			if (element < smallest) {
//				smallest = element;
//			}
//		}
//		System.out.println("Smallest " + smallest);
//		System.out.println("Biggest " + largest);
//		System.out.println("Second Largest " + largest2);

	}

}
