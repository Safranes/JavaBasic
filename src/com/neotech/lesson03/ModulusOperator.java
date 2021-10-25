package com.neotech.lesson03;

public class ModulusOperator {
public static void main(String[] args) {
	
	int a =25;
	int b= 4;
	int div=0;
	int rem=0;
	
	div=a/b; //25/4->6
	rem=a%b;//25%4->24 is fully divisible by 6 and the remainder is 1.
	
	System.out.println(div);
	System.out.println(rem);
	
	int c=13;
	int d=5;
	
	int rem2= c%d; // 13/5-->10/5 but the remainder of 13 is 3
	
	System.out.println(rem2);
}
}
