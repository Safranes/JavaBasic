package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {

		int[] points = { 90, 46, 98, 67, 43, 56, 100, 89 };
		// printing one
		System.out.println(points[0]);

		int length = points.length;

		// to print all values in points array the loop must start at "0" and must end
		// at "length -1"
		for (int i = 0; i < length; i++) {
			// 1st loop: i=0, so we print points[0]
			// 2nd loop: i=1, we print points[1]
			// ...
			System.out.print(points[i] + " ");
		}
		System.out.println();

		
		//Homework1- find the value for summation of all the numbers in points array
		//Homework2- find the value for average of all the numbers after summation in points array
		double sum = 0;
		double average = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + points[i];
			average = sum / 2;
		}
		System.out.println(sum);
		System.out.println(average);
	}
}
