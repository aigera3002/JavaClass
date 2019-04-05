package com.ReviewSession;

import java.util.Scanner;

public class review3task4 {
	public static void main(String[] args) {
		
		Scanner scan;
		int level=0;
		String levelString;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter level of experinece");
		
		levelString=scan.nextLine();

		switch(levelString) {
	
		case "Beginner level":
		level=1;
			break;	
		case "Intermediate level":
		level=2;
			break;	
		case "Expert":
		level=3;
			break;	
	}
		System.out.println("Your level is "+level);

    }
}
