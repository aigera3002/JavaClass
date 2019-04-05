package com.class4;

public class NestedIfCondition {
	public static void main(String[] args) {
		//write a program to check eligibility
		//if user is less than 16, say not allowed to work
		//else allow to work, if user is younger that 64, go to work, else do not work, enjoy your life
		
		int age=65;
		int eligibileAge=16;
		int retirementAge=64;
				
		if (age<eligibileAge) {
		   System.out.println("You are too youan to work, no work for you");
		   }else {
		   System.out.println("You are eligible to work");
		   if (age<retirementAge) 	{
		   System.out.println("Work hard");
		}else {
						System.out.println("Enjoy your life");
					}
			}
		
	}
}
