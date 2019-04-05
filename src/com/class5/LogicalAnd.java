package com.class5;

import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {
		
		//ask user to enter age and based on the age we will print;
		//if age is older that 1 but less than 3-->baby
		//if age is older 3 but less then 5 -->toddler
		//f age is older that 5 but less than 13-->kid
		//f age is older that 13 but less than 20-->teenager
		//f age is older that 20 but less than 64-->adult
		//if age is older or equato 64-->senior
		
		Scanner myScanner;
		int age;
		
		
		
		if (age>=1 && age<3) {
			System.out.println("you are a baby");
		}else if (age>= 3 && age<5) {
			System.out.println("you are a toddler");
		}else if (age>= 5 && age<13) {
			System.out.println("you are a kid");
		}else if (age>= 13 && age<20) {
			System.out.println("you are a teenager");
		}else if (age>= 20 && age<64) {
			System.out.println("you are an adult");
		}else {
			System.out.println("you are an senior");
			
		}
	
	}

}
