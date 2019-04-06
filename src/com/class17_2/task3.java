package com.class17_2;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
	
	//write a programm that reads a range of integers (start and the end point), provided by a user
	//and then from that range prints the sumof the even and odds integers
		
		Scanner input;
		int startPoint;
		int endPoint;
		int sumofEven=0;
		int sumofOdd=0;
		input=new Scanner (System.in);
		System.out.println("Enter your start point: ");
		startPoint=input.nextInt();
		System.out.println("Enter your end point: ");
		endPoint=input.nextInt();
		
		if(startPoint<endPoint) {
			for (int a=startPoint; a<=endPoint; a++) {
				if (a%2==0) {
					sumofEven+=a;
				}
				else {
					sumofOdd+=a;
				}
			}
				System.out.println("Your sum of even numbers are: "+sumofEven);
				System.out.println("Your sum of even numbers are: "+sumofOdd);
				
				}
			}
		}
		
	
