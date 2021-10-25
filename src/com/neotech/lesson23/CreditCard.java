package com.neotech.lesson23;

public class CreditCard {
	double balance, interest;

	public CreditCard(double balance) {
		this.balance = balance;
	}

	public void calculateInterest() {
		interest = 20;
		System.out.println("The interest rate is " + interest + "%");
	}
}

class Visa extends CreditCard {
	public Visa(double balance) {
		super(balance);
	}

	public void calculateInterest() {
		if (balance > 15000) {
			interest = 10;
		} else {
			interest = 25;
		}
		System.out.println("The interest rate is " + interest + "%");
	}
}

class AX extends CreditCard {
	public AX(double balance) {
		super(balance);
	}

	@Override
	public void calculateInterest() {
		if (balance > 9000) {
			interest = 15;
		} else {
			interest = 35;
		}
		System.out.println("The interest rate is " + interest + "%");
	}
}