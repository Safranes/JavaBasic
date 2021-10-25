package com.neotech.lesson27;

public abstract class Insurance {
/*Homework 3:
  Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviouras getQuote and cancelInsurance. 
  Create 3 subclasses Car, Pet, Health. Car class has it’sown attribute as carModel and Class Pet has petType attribute.
   Create 3 objects of the sub classes and store them in ArrayList. 
   Using for loop/advanced for loop/ iterator access all methods of the class.

 */
	
	String insuranceName;
	Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	
	 abstract void getQuote();
	 
	 abstract void cancelInsurance();
}
	 class CarIns extends Insurance{

		 String carModel;
		CarIns(String insuranceName,String carModel) {
			super(insuranceName);
			this.carModel=carModel;
		}

		@Override
		void getQuote() {
			System.out.println("Insurance quote depends on your "+carModel);
		}

		@Override
		void cancelInsurance() {
			System.out.println("Hope to see you back, canceling your car insurance");
		}
		 
	 }
	 
	  class PetIns extends Insurance{
		String petType;
		PetIns(String insuranceName,String petType){
			super(insuranceName);
			this.petType=petType;
		}
		@Override
		void getQuote() {
			System.out.println("Insurance quote depends on your "+petType);
			
		}
		@Override
		void cancelInsurance() {
			System.out.println("Hope to see you back, canceling your pet insurance");
			
		}
		 
	 }
	 class HealthInsurance extends Insurance {

		HealthInsurance(String insuranceName) {
			super(insuranceName);
		}

		@Override
		void getQuote() {
			System.out.println("The quote for health insurance is $1000");
			
		}

		@Override
		void cancelInsurance() {
			System.out.println("Hope to see you back, canceling your health insurance");
			
		}
		 
	 }

	
	
	

