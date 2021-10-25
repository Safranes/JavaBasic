package com.neotech.lesson21;
//Homework 5:
//    Write program: userClass that has a constructor that
//    initializes instance variable name and mobile number.
//    Create a subclass userInfo that will have user address
//    variable and it also being initialized through constructor
//    call. Print users name, mobile number and address in
//    userDetails method. Test your code.
public class userClass {
String name;
int mobileNumber;

userClass(String name, int mobileNumber){
	this.name=name;
	this.mobileNumber=mobileNumber;
	
}
}

class userInfo extends userClass{
String userAddress;
	userInfo(String name, int mobileNumber, String userAddress) {
		super(name, mobileNumber);
		this.userAddress=userAddress;
	}
	
	public void userDetails() {
		System.out.println(name+ " "+ mobileNumber+" "+userAddress);
	}
	
	
}