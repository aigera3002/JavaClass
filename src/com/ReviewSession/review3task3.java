package com.ReviewSession;

import java.util.Scanner;

public class review3task3 {
	public static void main(String[] args) {
		
		Scanner scan;
		int day;
		String out;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter the day");
		day=scan.nextInt();

		switch(day) {
		

		case 1:
			out="Monday";
			break;
		case 2:
			out="Tuesday";
			break;
		case 3:
			out="Wednesday";
			break;
		case 4:
			out="Thursday";
			break;
		case 5:
			out="Friday";
			break;
		case 6:
			out="Saturday";
			break;
		case 7:
			out="Sunday";
			break;
		default:
			out="Invalid";
			}	
		System.out.println("Today is "+out);
	}
}
