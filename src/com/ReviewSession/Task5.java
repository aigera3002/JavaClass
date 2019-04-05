package com.ReviewSession;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		String name;
		String gender;
		int age;
		long phoneNumber;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("What is your name?");
	    name =scanner.nextLine();
		
		System.out.println("What is your gender?");
		gender=scanner.nextLine();
		
		System.out.println("What is your age?");
		age=scanner.nextInt();
		
		System.out.println("What is your phone number");
		phoneNumber=scanner.nextLong();
		
		System.out.println("name " +name);
		System.out.println("gender "+gender);
		System.out.println("age "+age);
		System.out.println("Phone number "+phoneNumber);
		
		
	}	
		
		

}
