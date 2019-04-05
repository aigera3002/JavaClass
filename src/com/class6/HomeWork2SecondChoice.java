package com.class6;

import java.util.Scanner;

public class HomeWork2SecondChoice {
	
	public static void main(String[] args) {
	
		//write a program to find largest of three double values using nested if
	    // provided by user (numbers must be distinct)	
				
		int num1, num2, num3, largest;
				
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Please enter 3 double values");
				
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();	
				
		if (num1>num2) {
			if(num1>num3) {
				largest=num1;
			}else { 
			 largest=num3;
			}
		}else { //assuming num2>num3
			 if (num2>3) {
			largest=num2;
		     }else {
			largest=num3;	
		 }
	}
		System.out.println("The largest number is "+largest);
	}
}