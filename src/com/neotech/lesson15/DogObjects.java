package com.neotech.lesson15;

public class DogObjects {

	public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.name="Smoke";
		Husky.size="Medium";
		Husky.color="Grey";
		Husky.age=5;
		
		Husky.learn();
		Husky.play();
		
		Dog Bulldog=new Dog();
		Bulldog.name="Ares";
		Bulldog.size="Small";
		Bulldog.color="Black";
		Bulldog.age=3;
		
		Bulldog.learn();
		Bulldog.play();
		
		Dog Labrador=new Dog();
		Labrador.name="Cloud";
		Labrador.size="Large";
		Labrador.color="Brown";
		Labrador.age=7;
		
		Labrador.learn();
		Labrador.service();
		Labrador.play();
		

	}

}
