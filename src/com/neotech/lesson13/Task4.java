package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
//Task 4: Create an array of cars : American, German, Korean, Italian. Then retrieve all values 
//from that array using 2 different loops
		
		String[][] cars= {
				{"chevrolet","dodge","ford","lincoln"},
				{"bmw","mercedes","wolkswagen"},
				{"mazda","kia"},
				{"ferrari","alfa romeo","lamborghini"}
		};
for(int row=0; row<cars.length; row++) {
	for(int col=0; col<cars[row].length; col++) {
		System.out.print(cars[row][col]+" ");
	}
	System.out.println();
}
System.out.println("--using for each loop--");
for(String[] row: cars) {
	for(String car: row) {
		System.out.print(car+" ");
	}
	System.out.println();
}
	}

}
