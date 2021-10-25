package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
//Task 3. Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
//	Print the sum of all numbers.(Use For and For Each) 

		int[][] nums = { { 5, 3, 6 }, { 2, 14, 13 }, { 7, 9, 3 } };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
		}
		System.out.println("sum is: " + sum);

		System.out.println("--USING FOR EACH LOOP---");
		int total = 0;
		for (int[] row : nums) {
			for (int num : row) {
				total += num;
			}
		}
		System.out.println("total is: " + total);

		//SABAH'S SOLUTION
		
//	int[][] num = {{3,5,4,5},{6,5},{2,4,8,4}}; 
//	
//	
//	int sum = 0; 
//	
//	
//	for (int i = 0; i < num.length; i++ )
//	{
//		for( int j = 0; j < num[i].length; j++)
//		{
//			sum = sum + num[i][j];
//			//use the shorthand operator
//			//sum+= num[i][j];
//		}
//	}
//	
//	System.out.println("the total sum of the integers in the 2D array is : " + sum);
//	
//	//using for each loop 
//	
//	int sum2 = 0; 
//	
//	for (int[] row : num)
//	{
//		for (int col : row)
//		{
//			sum2 += col;
//		}
//	}
//	
//	System.out.println("The total sum using the for each loop is : " + sum2);
//	
//	

	}

}
