package com.neotech.lesson09;

public class Task1 {
public static void main(String[] args) {
	
//	1. Print numbers from 1 to 100 in 1 line with space
//	2.Print numbers from 100 to 1
//	3.Print even numbers from 20 to 1 (2 ways)
//	4.Print odd numbers between 20 and 50 (2 ways)
	
	//1.
	for(int i=1; i<100; i++) {
		System.out.print(i+" ");
	}
	System.out.println("");
	//2.
	for (int i = 100; i >= 1; i--) {
		System.out.print(i+" ");
	}
	//3.
	System.out.println("--------------");
	// Print even numbers from 20 to 1 (2 ways)
	for (int i = 20; i >= 1; i -= 2) { // decreasing by 2
		System.out.println(i);
	}

	System.out.println("--------------");
	for (int i = 20; i >= 1; i--) {// decreasing by

		if (i % 2 == 0) {// if number is even
			System.out.println(i);
		}

	}
//	4.
	for(int i=20; i<50; i++) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}
	System.out.println("-------");/// Bu alttaki cozum biraz kafami karistirdi SOR BUNU!!
	//ONCE i DEGERINE GORE PRINT YAPIP SONRA INCREMENTATION YAPIP SONRA DA BLOCK ICINDEKI INCREMENTATION I YAPIP SONRA YAZDIRMAMIZ 
	//KAFAMI KARISTIRDI

	for(int i=21; i<50; i++) {
		System.out.println(i);
		i++;
	}
	
}
}
