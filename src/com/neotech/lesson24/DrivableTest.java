package com.neotech.lesson24;

public class DrivableTest {
	public static void main(String[] args) {

//	Vehicles v= new Vehicles();// CE: 

		Vehicles v = new Cars();
		v.start(); // runs the method implemented in Vehicles Class
		v.stop(); // runs the method implemented in Cars Class

		Drivable dr = new Cars();
		dr.drive();// runs the implemented method in Cars class
		System.out.println(Drivable.MOVE_FAST);

		// Drivable.MOVE_FAST = false; //You cannot do this -->its public static final by default

	}
}
