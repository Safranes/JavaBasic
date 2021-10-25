package com.neotech.lesson21;



public class TestTeacher {
public static void main(String[] args) {
		
		Teacher t = new Teacher("Atilla", "Tas");
		MathTeacher mt = new MathTeacher("Enes", "Safran", "Calculus");
		ChemistryTeacher ct = new ChemistryTeacher("Komron", "Baba", "High School");
		PianoTeacher pt = new PianoTeacher("Adrian", "Lope", "Art School" );
	
		t.teaching();
		System.out.println("----------------");
		pt.teaching();
		pt.teachingPiano();
		System.out.println("----------------");
		ct.teaching();
		ct.teachingChemistry();
		System.out.println("----------------");
		mt.teaching();
		mt.teachingMath();
	}

}


