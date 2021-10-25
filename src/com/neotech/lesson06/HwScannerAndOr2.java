package com.neotech.lesson06;

import java.util.Scanner;

public class HwScannerAndOr2 {
	public static void main(String[] args) {

		Scanner ask=new Scanner(System.in);
		System.out.println("Please enter a number between 1-7 regarding the days of the week");
		int day=ask.nextInt();
		
		
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		
		System.out.println("--------using ors--------------------");
		
		if (day==1 || day==2 || day==3 ||day==4 || day==5) {
			System.out.println("It is a weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
	}
	

}
