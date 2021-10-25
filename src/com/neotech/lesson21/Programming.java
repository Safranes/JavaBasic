package com.neotech.lesson21;
//Homework 4:
//    Create a class named 'Programming'. While creating an
//    object of the class, if nothing is passed to it, then the
//    message "I love programming languages" should be
//    printed. If some String is passed to it, then in place of
//    "programming languages" the value variable should be
//    printed. Example, if we pass "Java", then "I love Java"
//    should be printed.
public class Programming {

	String name;
	Programming(){
		name="programming languages";
		
	}
	
	Programming(String name){
		this.name=name;
	}
	
	void reaction() {
		System.out.println("I love "+name);	
		}
	
	public static void main(String[] args) {
		
		Programming language=new Programming();
		Programming languages=new Programming("Java");
		
		language.reaction();
		languages.reaction();
	}

	
}
