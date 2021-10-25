package com.neotech.lesson06;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// 1. You are a loan specialist and you need to ask user what is the amount of
		// loan is needed. If loan is less or equal to 200,000 then you would lend the
		// money otherwise you would reject the client.

		Scanner ask=new Scanner(System.in);
		
		System.out.println("How much loan you need?");
		int loan=ask.nextInt();
		if(loan<=200000) {
					System.out.println("Congratulations!You can have this loan.");
		}else {
			System.out.println("Unfortunately, you cannot have this loan.");
		}
		
		
		
	}

}
