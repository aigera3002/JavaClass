package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
	//take a number from a user and print that number
	//int num=22;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter any number");
		int myNumber =scanner.nextInt();
		
		System.out.println("The number you entered is " +myNumber);
	}
}