package com.class4;

import java.util.Scanner;

public class classTask {

	public static void main(String[] args) {
		
		
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter the amount of loan: ");
		
		int loan=Input.nextInt();
		
		if (loan<200000) {
		
			System.out.println("I will lend the money");
		} else {
			System.out.println("I can't borrow you money");
		}
		
	
	
	
	
	
	}
	
	
	
	
}
