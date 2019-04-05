package com.class4;

import java.util.Scanner;

public class classTask1 {
	public static void main(String[] args) {
		
		int age;
		
		Scanner Input=new Scanner(System.in);
		System.out.println("what is the age ");
		
		age=Input.nextInt();
		
		if (age==18) {
			
			System.out.println("I will issue a driver licence");
		} else  if (age>18) {
			System.out.println("I will offer you to get a licence");
		} else {
			System.out.println("I will offer you to get a learners permit");
			
		}
		
		
		
		
	}

}
