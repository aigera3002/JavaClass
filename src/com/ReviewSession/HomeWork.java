package com.ReviewSession;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		//create a program that will take a boolean value from a user make the varialble
		//if the input is True or False then output shoud read.
		//first output: "Input the bollean value"
		//second output: "The value is__"

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a boolean value");
	boolean isTrue=scan.hasNextBoolean();
	System.out.println("The value is "+isTrue);
	}

}
