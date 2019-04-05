package com.class4;

public class Task2 {
	public static void main(String[] args) {
		double morgageRate=4.8;
		int morgagePrice=300000;
		
		if (morgageRate<4.5) {
			
			System.out.println("I will consider buying");
			if (morgagePrice<200000) {
				System.out.println("I am paying with cash");
			}else {
				System.out.println("I will take a loan");
			}
		}else {
			System.out.println("I will not buy the house");
		}
	}
}
