package com.class6;

import java.util.Scanner;

public class HomeWork2 {
	
	public static void main(String[] args) {
		
		//write a program to find largest of three double values using nested if
		// provided by user (numbers must be distinct)	
		
		int num1, num2, num3;
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter 3 double values");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();	
		
		if (num1>num2) {
			if(num1>num3) {
			  System.out.println(num1+ " is the largest");
		    }else { //assuming num2>1
			  System.out.println(num3+ " is the largest");
		    }
		}else {
			if (num2>3) {
			  System.out.println(num2+ " is the largest");
			}else {
			  System.out.println(num3+ " is the largest");	
			}
		}
	}
		
}