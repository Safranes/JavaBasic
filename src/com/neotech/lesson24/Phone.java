package com.neotech.lesson24;

public abstract class Phone {

	// implement method
	public void call() {
		System.out.println("Phone make calls");
	}

	public void text() {
		System.out.println("Phone can send texts!");
	}

	abstract void takePicture();

	abstract void playMusic();
}

class iPhone extends Phone {

	@Override
	void takePicture() {
		System.out.println("iPhones can take pictures!!");

	}

	@Override
	void playMusic() {
		System.out.println("iPhones can play music!! ");

	}

	//override

	public void call() {
		System.out.println("iPhones can make calls!!");
	}
}

class Samsung extends Phone {

	@Override
	void takePicture() {
		System.out.println("Samsung can take pictures!!");
	}

	@Override
	void playMusic() {
		System.out.println("Samsung can play music!! ");
	}

	public void playGames() {
		System.out.println("Samsung can play games");

	}

}
