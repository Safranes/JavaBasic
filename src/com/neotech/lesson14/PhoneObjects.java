package com.neotech.lesson14;

public class PhoneObjects {

	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.color = "Gold";
		iPhone.brand = "iPhone";
		iPhone.model = "12 Pro";
		iPhone.ram = 6;

		iPhone.call();
		iPhone.text();
		iPhone.record();

		Phone Android = new Phone();
		Android.color = "Black";
		Android.brand = "Samsung";
		Android.model = "S20";
		Android.ram = 12;

		Android.call();
		Android.text();
		Android.record();

		Phone Nokia = new Phone();
		Nokia.color = "Blue";
		Nokia.brand = "Nokia";
		Nokia.model = "3310";
		Nokia.ram = 0;

		Nokia.call();
		Nokia.text();

	}

}
