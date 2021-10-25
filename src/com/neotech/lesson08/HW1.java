package com.neotech.lesson08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// Write a program using while loop that calculates the sum of the even numbers between 0 and 10.
	Scanner scan=new Scanner(System.in);
	int sum=0 , i=0;
	
	while(i<=10) {
		sum=sum+i;//sum+=i;
		i+=2;	
	}
System.out.println("The sum of the even numbers between 0 and 10 is "+ sum);
	
//2nd way
while(i<=10) {
	if(i%2==0) {
		sum=sum+i;//sum+=i;
	}
	i++;// you have to put the incrementation outside the if 
}
System.out.println("sum= "+sum);
	}

}
