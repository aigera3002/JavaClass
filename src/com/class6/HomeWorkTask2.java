package com.class6;

import java.util.Scanner;

public class HomeWorkTask2 {
	public static void main (String[] args) {
		
	    Scanner scan;
		int grade;
	    String explanation;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your grade");
		grade=scan.nextInt();
		
		switch(grade) {
		
		case 'A':
			explanation="Exellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		default:
			explanation="Not acceptable";
		}
   }
}
