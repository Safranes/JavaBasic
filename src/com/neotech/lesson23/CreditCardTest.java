package com.neotech.lesson23;



public class CreditCardTest {
	public static void main(String[] args) {
		//hw1
		// Create a class CreditCard and define variable balance and interest.
		// Create an instance method that will calculate interest based on the given
		// balance.
		// Create 2 subclasses: Visa and AX. In AX class override method calculate
		// interest.
		// Call the method by creating an object of each of the three classes.

		CreditCard cc1 = new CreditCard(10000);
		cc1.calculateInterest();
		
		CreditCard cc2 = new Visa(10000);
		cc2.calculateInterest();
		
		CreditCard cc3 = new AX(10000);
		cc3.calculateInterest();
		
		
		
	}
}