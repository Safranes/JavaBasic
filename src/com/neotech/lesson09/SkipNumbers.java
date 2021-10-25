package com.neotech.lesson09;

public class SkipNumbers {

	public static void main(String[] args) {
		// 

		
		
		
		System.out.println("---------");
		//I want to print numbers from 10 to 50
		//but I want to skip from 25 to 45
		for(int k=10; k<=50; k++ ) {
			
			if(25<=k&&k<=45) {
				continue;
			}
			System.out.println(k);
		}
	}

}
