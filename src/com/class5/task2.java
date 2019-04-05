package com.class5;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		
	//Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
	//if the average score >=90 =>grade=A
	//if the average score >= 70 and <90 => grade=B
	//if the average score>=50 and <70 =>grade=C
	//if the average score<50 =>grade=F	
		
		Scanner myScanner;
		Scanner Input = new Scanner (System.in);
		
		
		
		
		System.out.println("Pleaser enter the quiz score");
		int quiz=Input.nextInt();
		System.out.println("Plese enter the mid term");
		int midTerm=Input.nextInt();
		System.out.println("Please enter final score");
		int finalScore=Input.nextInt();
		
		int ave=(quiz+midTerm+finalScore)/3;
		
		if (ave>=90) {
		System.out.println("The grade is A");
	    }else if(ave>=70 && ave <90) {
	    System.out.println("The grade is B");
        }else if(ave>=50 && ave<70) {
        System.out.println("The grade is C");
        }else if (ave<50) {
        System.out.println("The grade is F");
        	
	    	
        }	
	}

}
