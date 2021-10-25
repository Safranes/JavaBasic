package com.neotech.lesson13;

public class Hw1_Countries {

	public static void main(String[] args) {
//Create an array of countries: north America countries, south America countries, Europe countries, 
//Asian countries, African countries. Then print all values from that array using 2 different loops
//and calculate how many total countries been stored.
		String[][] countries= {
				{"USA","Canada","Mexico"},
				{"Brazil", "Argentina"},
				{"Italy","Slovakia","Bulgaria"},
				{"China","South Korea","Japan"},
				{"Ghana","Kenya", "Nigeria"}
		};

		int total=0;
		
		for(int i=0; i<countries.length; i++) {
			for(int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+", ");		}
			System.out.println();
			total+=countries[i].length;
		}
				System.out.println("There are "+total+" countries stored.");		
	}

}
