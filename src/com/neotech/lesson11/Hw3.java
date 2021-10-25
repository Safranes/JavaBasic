package com.neotech.lesson11;

public class Hw3 {

	public static void main(String[] args) {
//Homework 3:Create an array of countries. While retrieving all values from an array print capital for each country.

		String[] countries={"Turkey","France", "Hungary", "Italy", "USA"};
		
		for(int index=0; index<countries.length; index++) {
			if(countries[index].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[index].equals("France")) {
				System.out.println("Paris");
			}else if(countries[index].equals("Hungary")) {
				System.out.println("Budapest");
			}else if(countries[index].equals("Italy")){
				System.out.println("Rome");
			}else if(countries[index].equals("USA")) {
				System.out.println("Washington,D.C");
			}
		}
	}

}
