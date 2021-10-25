package com.neotech.lesson25;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration obj = new Registration();

		obj.setEmail("jimmy@yahoo.com");
		System.out.println(obj.getEmail());

		obj.setEmail("1245gdfg");
		System.out.println(obj.getEmail());
		
		obj.setUserName("Safranes");
		System.out.println(obj.getUserName());

		obj.setPassword("1245");
		System.out.println(obj.getPassword());

		obj.setPassword("1234567");
		System.out.println(obj.getPassword());

		

	}

}
