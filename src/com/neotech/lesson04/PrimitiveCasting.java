package com.neotech.lesson04;

public class PrimitiveCasting {
	public static void main(String[] args) {
		//smallest to the biggest
		//byte->short->int->long->float->double
		
		double d1= 7.5;// no casting/conversion
		System.out.println(d1);
		
		double d2=7;//casting is happening
		System.out.println(d2);
		
		//widening or implicit casting and it is done automatically
		int num1=10;
		double d3= num1; //casting 
		System.out.println(d3);
		
		//narrowing, explicit casting, should be done manually
		//int num2 = 7.9;//compiler error, Type mismatch: cannot convert from double to int
		
		int num2= (int) 7.9; //I tell the compiler: I want to store as an integer
		System.out.println(num2);
		
		//narrowing,explicit casting, should be done manually
		byte b1= (byte)12345; //I will take the responsibility
		System.out.println(b1);
		
		System.out.println("**********");
		
		int i2 =5;
		byte b2= (byte) i2; // I may or may not lose data
		System.out.println(b2); // I don't lose any data
		
		//narrowing
		long long1=85;
		int number1=(int) long1;//I may lose data
		System.out.println(number1);
		
		//narrowing
		//you are trying to fit something big into a small container
		long long2= 83764873645L;
		int int2=(int)long2;//I may lose data
		System.out.println(int2);
		
		//widening
		int number3=195;
		float f3=(float) number3;// you can specify it by typing (float) on the other side of the equation, but you don't need to
		float f4 = number3; // Because it is widening and done automatically, I know that I will not lose data
		
		//quick task
		//try to store 5.84 into a byte
		//try to store 19 as double
		
		//narrowing, manually
		double double1= 5.84;
		byte byte1=(byte)double1;// we loose data
		System.out.println(byte1);
		
		//widening, automatically
		int w1=19;
		double r1=w1;
		System.out.println(r1);
		
		
		
		
	}

}
