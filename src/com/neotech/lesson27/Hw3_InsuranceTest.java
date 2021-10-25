package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw3_InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance> insuranceAL=new ArrayList<>();
		
		insuranceAL.add(new CarIns("Geico", "Mazda"));
		insuranceAL.add(new PetIns("InsuredPet", "Cat"));
		insuranceAL.add(new HealthInsurance("Florida Blue"));

		Iterator<Insurance> it = insuranceAL.iterator();

		while (it.hasNext()) {
			Insurance ins = it.next();
			ins.getQuote();
			ins.cancelInsurance();
		}
		System.out.println();
		for(Insurance in:insuranceAL) {
			in.getQuote();
			in.cancelInsurance();
		}
		System.out.println();
		for(int i=0; i<insuranceAL.size(); i++) {
			insuranceAL.get(i).getQuote();
			insuranceAL.get(i).cancelInsurance();
		}
	}
}

