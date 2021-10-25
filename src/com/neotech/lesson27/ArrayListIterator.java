package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		// int and double (primitive types) are not objects, that is why we need wrapper classes Integer and Double.
		
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("hershey");
		choco.add("godiva");
		choco.add("snickers");
		
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		
		sweets.addAll(choco);//by default, puts all objects of choco AL, at the en od the sweets AL
		
		System.out.println("The size of the sweets ArrayList is: "+ sweets.size());
		System.out.println(sweets);
		
		//how do we use an iterator:
		Iterator<String> it= sweets.iterator();//import it from java.util.iterator
		
		//1 diretion
		while(it.hasNext())
		{
			String str =it.next();//This is very important,if you don't store it in an Object( String in this example), you can print this it.next()
			System.out.print(str+" - ");//directly right here BUT then you have to use it.next() below in the if condition and that is where you
			//will have problem.. Because it.next() will move the cursor to the next element every time you use it!! 
			//IT MEANS YOU WILL SKIP AN OBJECT!!
			if(str.equals("ice cream")) {
				it.remove();//remove the current element from the collection
			}		
		}
		
		System.out.println();
		System.out.println(sweets);
		
		//for loop
		//1 direction
		for(String str:sweets) {
			System.out.print(str+" - ");
		}
		
		
		
		
		
	}

}
