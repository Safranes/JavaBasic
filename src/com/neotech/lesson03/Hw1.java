package com.neotech.lesson03;

public class Hw1 {

	public static void main(String[] args) {
		// Write a java program to display the area and perimeter of a circle that has a radius of 5. Use pi = 3.
		
		int radius=5;
		int pi=3;
		
		int area= pi*radius*radius;
		int perimeter=2*pi*radius;
		
		System.out.println("The area of a circle with a radius of 5 is "+ area+" and perimeter is "+ perimeter+".");
		
		//Write a java program that converts mile to km and km to miles. Use scale 1 mile = 1.609344
		
		double km, mile;
		km=0;
		mile=0;
		
		km=160;
		mile=300;
		
		double kmToMile=km/1.609344;
		double mileToKm=mile*1.609344;
		
		
		System.out.println("The result of "+km+"km"+ " converted to miles is "+kmToMile+".");
		System.out.println("The result of "+mile+"miles "+"converted to kilometers is "+mileToKm+".");
		
		
	}
}
