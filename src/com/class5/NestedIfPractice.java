package com.class5;

public class NestedIfPractice {
	//check what is the balance is more than 1000-->pay off now
	//else you are good

	public static void main(String[] args) {
		
		boolean creditCard=true;
		int balance=1000;
		
		if (creditCard) {
			System.out.println("Lets check the balance");
			if(balance>=1000) {
				System.out.println("pay off now");
		}else {
			System.out.println("you are safe");
		}
	}else {
		System.out.println("do you want a credit card");
	  }
		
	}
}
	
	
	
