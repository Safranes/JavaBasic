package com.neotech.lesson13;

public class Task1And2 {

	public static void main(String[] args) {
//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
//2.Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
//Develop a program which will identify/print the even numbers only.

		int[][] nums = { { 3, 9, 12, 36 },
						 { 4, 1, 6, 8 },
						 { 14, 15, 27, 30 } };

		for (int i = 0; i < nums.length; i++) {
			for(int j=0; j<nums[i].length;j++) {
				System.out.print(nums[i][j]+", ");
			}
System.out.println();
		}
		System.out.println("----Task2----");

		for(int k=0; k<nums.length; k++) {
			for(int l=0; l<nums[k].length;l++) {
				if(nums[k][l]%2==0) {
					System.out.println(nums[k][l]+" is an even number.");
				}
				}
			}
		
		}
	}


