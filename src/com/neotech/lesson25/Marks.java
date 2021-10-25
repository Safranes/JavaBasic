package com.neotech.lesson25;
//We have to calculate the average of marks obtained in
//three subjects by student A and by student B. Create a
//class 'Marks' with an abstract method 'getAverage' that will
//be returning the average of marks. Provide implementation
//of the abstract method in classes 'StudentA' and 'StudentB'.
//The constructor of StudentA takes the marks of three
//subjects as parameters and the constructor of StudentB
//takes marks of four subjects as parameters. Test your
//code.
public abstract class Marks {
//You cannot create objects in abstract classes!!
	
	//SECOND TASK!!
	public abstract double getAverage();//un-implemented method
}

//If you gonna extend an abstract class then it needs to implement the methods from abstract class or it has to be an abstract class
class StudentA extends Marks{
	double mark1,mark2,mark3;
	
	StudentA(double mark1, double mark2, double mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}

	@Override
	public double getAverage() {
		return(mark1+mark2+mark3)/3;
	}
}

class StudentB extends Marks {
	double mark1, mark2, mark3, mark4;

	StudentB(double mark1, double mark2, double mark3, double mark4) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	@Override
	public double getAverage() {
		return (mark1 + mark2 + mark3 + mark4) / 4;
	}
}

