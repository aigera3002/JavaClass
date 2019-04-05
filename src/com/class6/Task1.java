package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
//write a program that prints out if its good weather to go for any activity or not 
//if the temperature is between 40 degrees and 80 degrees inclusive & no rain --> we will 
        //go for hiking, otherwise --> we will not go hiking
//if the temperature is between 25 and 40 inclusive & snowing --> going snowboarding otherwise we 
		//are not going snowboarding
//if temperature is more than 80 & sunny__> go to beach, otherwise -->not go to beach
	
	Scanner scan;
	boolean snow, rain, sunny;
	int temp;
	String activity;
	
	scan =new Scanner (System.in);
	
	System.out.println("Please enter the temperature");
	
	temp=scan.nextInt();
	if (temp>=40 && temp>=80) {
		System.out.println("Is it raining?");
		rain=scan.nextBoolean();
		    if (rain) {
		    	activity="watch movie";
		    }else {
		    	activity="go hiking";
		    }
		
	}else if (temp>=25 && temp>=40) {
		System.out.println("Is it snowing?");
		snow=scan.nextBoolean();
		     if (snow) {
	    	    activity="snowbording";
	         }else {
	    	    activity="do coding";
	        }
		
	}else if (temp>=80) {
		System.out.println("Is it sunny?");
		sunny=scan.nextBoolean();
		      if (sunny) {
	    	    activity="go to the beach";
	         }else {
	    	    activity="do more coding";
	        }
	
	}else {
		System.out.println("Please enter different temperature");
		activity="Unknown";
	 }
System.out.println("My activity for today is "+activity);
	}
}
	
		
		
		
