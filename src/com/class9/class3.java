package com.class9;

import java.util.Scanner;

public class class3 {
	public static void main(String[] args) {
		
//Write a program that reads a range of integers (start and end point), provided 
//by a user and then from that range prints the sum of the even and odd integers.
		//Scanner will take an input from user
		//startRange=first user input
		//endRange=second user input
		//for (startRange; endRange; increment) {
		//if ( ) {
		//	do sum of even numbers;
		//}else {
		//	do sum of odd numbers;
		
		Scanner scan;
		scan=new Scanner (System.in);
		
		int startPoint;
		int endPoint;
		int sumEven=0; 
		int sumOdd=0;
		
		System.out.println("please enter start point");
		startPoint=scan.nextInt();
		
		System.out.println("please enter the end point");
		endPoint=scan.nextInt();
		
		if (startPoint<endPoint) {
		
		for (int a=startPoint; a<=endPoint; a++) {
			if (a%2==0) {
				sumEven+=a;
			}else {
				sumOdd+=a;
				}
		   }
		System.out.println("The sum of even number is " +sumEven);
		System.out.println("The sum of odd number is " +sumOdd);
        }
	}	
}