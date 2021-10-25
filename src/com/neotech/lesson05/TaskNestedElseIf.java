package com.neotech.lesson05;

public class TaskNestedElseIf {

	public static void main(String[] args) {
//		Write a Java program to check if a student has
//		done the Quiz. If the student did the Quiz, then
//		check the score and give the following evaluations:
//		o If the score is 90 or greater, print “A, Great job!”.
//		o If the score is 80 or greater, print “B, Well done!”.
//		o If the score is 70 or greater, print “C, You passed!”.
//		o Otherwise, print “F, You failed”.
		
		boolean quizCompleted=true;
		int score=85;
		if(quizCompleted) {
			if(score>=90) {
				System.out.println("A, Great job!");
			}
			else if(score>=80) {
				System.out.println("B, Well done!");
			}
			else if(score>=70) {
				System.out.println("C, You passed!");
			}
		}else {
			System.out.println("F,You failed!");
		}
	}

}
