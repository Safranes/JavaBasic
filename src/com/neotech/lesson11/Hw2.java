package com.neotech.lesson11;

public class Hw2 {

	public static void main(String[] args) {
//		Homework 2:	Create an array on integers and calculate the sum of all elements in an array.

		int[] nums= {33,13,15,3};
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			
		}
		System.out.println("The sum of all the elements in nums array is: "+sum);
		

}
}
