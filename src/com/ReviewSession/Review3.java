package com.ReviewSession;

public class Review3 {
	public static void main (String[] args)  {
		
		// Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear summer clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside	
		
		
		int temp=35;
		String output;
		
		if (temp>=100) {
			System.out.println("stay inside its too hot");
		}else if (temp>50 && temp<99) {
			System.out.println("wear summer clothes");
		}else if (temp>30 && temp<49) {
			System.out.println("wear winter clothes");
        }else if (temp>10 && temp<29) {
		    System.out.println("stay inside its too cold");
        }else {
        	System.out.println("call for help its too cold outside");
		}	
		
	}

}
