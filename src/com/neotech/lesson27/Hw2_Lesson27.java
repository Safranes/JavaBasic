package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2_Lesson27 {
//	Homework 2:
//	    Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.

	public static void main(String[] args) {
		ArrayList<Integer> evenN=new ArrayList<>();
		
		for(int i=0; i<=50; i+=2) {
			evenN.add(i);
			
		}
		System.out.println(evenN);
		
		Iterator<Integer> it=evenN.iterator();
		while(it.hasNext()) {
			Integer number=it.next();
			if(number%5==0) {
				it.remove();
			}
		}
		System.out.println(evenN);
	}
	
}
