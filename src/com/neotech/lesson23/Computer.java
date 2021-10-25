package com.neotech.lesson23;

public class Computer {
int ram, hardDrive;

public Computer(int ram, int hardDrive) {
	this.ram=ram;
	this.hardDrive=hardDrive;
	
}
	public void specs() {
		System.out.println("Ram of the computer is "+ram+"GB" +"and hard drive is "+hardDrive+"GB");
	}

}

class Apple extends Computer{

	public Apple(int ram, int hardDrive) {
		super(ram, hardDrive);
		
	}
	@Override
	public void specs() {
		System.out.println("Apple has a "+ram+"GB"+" ram"+" and "+hardDrive+"GB"+ "hardDrive");
	}
	
	void appleId() {
		System.out.println("You can use Apple ID in Apple computers");
	}
}

class Lenovo extends Computer{

	public Lenovo(int ram, int hardDrive) {
		super(ram, hardDrive);
		
	}
	@Override
	public void specs() {
		System.out.println("Lenovo has a "+ram+"GB"+" ram"+" and "+hardDrive+"GB"+ "hardDrive");
	}
	void durable() {
		System.out.println("Lenovo is the most durable computer brand");
	}
}

class HP extends Computer{

	public HP(int ram, int hardDrive) {
		super(ram, hardDrive);
		
	}
	@Override
	public void specs() {
		System.out.println("HP has a "+ram+"GB"+" ram"+" and "+hardDrive+"GB"+ "hardDrive");
	}
	void cheap() {
		System.out.println("HP is the cheapest computer brand");
	}
}

class Dell extends Computer{

	public Dell(int ram, int hardDrive) {
		super(ram, hardDrive);
		
	}
	@Override
	public void specs() {
		System.out.println("Dell has a "+ram+"GB"+" ram"+" and "+hardDrive+"GB"+ "hardDrive");
	}
	void dell() {
		System.out.println("Dell computers are one of the best");
	}
}