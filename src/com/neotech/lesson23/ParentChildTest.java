package com.neotech.lesson23;

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p=new Parent();
//		p.hello();//this is a private method, so we cannot access
		p.bye();
		
		Child ch = new Child();
		
		Child.bye();
		

	}

}
