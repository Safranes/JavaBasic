package com.neotech.lesson12;

public class Hw2 {

	public static void main(String[] args) {
//2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
//Then you program should print name of the students that has A and B grade

		String[][] results= {
				{"Jack", "Ben","John","Chris"},
				{"C","B","A","D"}
		};
	
		if(results[1][0].equals("A")||results[1][0].equals("B")){
			System.out.println(results[0][0]);
			
		}if(results[1][1].equals("A")||results[1][1].equals("B")) {
			System.out.println(results[0][1]);
		}if(results[1][2].equals("A")||results[1][2].equals("B")) {
			System.out.println(results[0][2]);
		} if(results[1][3].equals("A")||results[1][3].equals("B")) {
			System.out.println(results[0][3]);
		}
	
	}

}
