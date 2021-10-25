package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {
		//upcasting-Creating an object of Tiger and assigning into Animal--So we have a tiger casted as an Animal
		//and behaving like a Tiger but can only use whatever methods Animal class has!!
		//object is of class Animal and we are initializing with a tiger
		Animal obj = new Tiger();
		obj.eat();//It will check if tiger class has this method?(check for overriding)
		//if the tiger class has it, that one is run
		//if the tiger class does not have it, then the method in the animal class is run.
		obj.sleep();
		// obj.run();// run() is not defined in the Animal class

		System.out.println("=========");

		Animal obj2 = new Animal();
		// only the parent methods are available
		obj2.eat();
		obj2.sleep();
		
		System.out.println("=======");
		
		Tiger obj3 = new Tiger();
		obj3.eat();
		obj3.sleep();
		obj3.run();
		
		System.out.println("=====");

		Cub obj4 = new Cub();
		obj4.eat();
		obj4.sleep();// This will print the method from Animal class because
//		we commented out the method in Tiger class, so we didn't override the method 

		// downcasting is not done like this
//		Tiger obj5 = new Animal();

	}

}
