package com.neotech.lesson25;
//Homework 1:

//    Create Registration Class in which you would have
//    variables as email, userName and password that
//    have an access scope only within its own class.
//    After creating an object of the class user should be
//    able to call methods and in each method separately
//    pass values to set users email, username and
//    password.
//
//    Requirements:
//    Valid email consider to be only yahoo!
//    Valid userName and password cannot be empty and should be of length larger than 6 characters.
//    Also valid password cannot contain userName.

public class Registration {
	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Please enter a valid email!(yahoo)");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("User name cannot be empty and has to be more than 6 characters");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password cannot contain the userName!!!");
				}

			} else {
				System.out.println("Password cannot be shorter than 6 characters!!");
			}
		} else {
			System.out.println("Password cannot be empty!!");
		}

	}

}
