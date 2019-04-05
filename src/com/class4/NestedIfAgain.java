package com.class4;

public class NestedIfAgain {
	//declare vriable for gpa and ha ing a diploma
	//if user has a diploma-->congratulations -->if gpa is higher 3.5-->hire person ,else dont hire
	
	public static void main(String[] args) {
		
		double gpa=3.6;
		double expectedGpa=3.7;
		
		boolean hasDiploma=true;
		
		if(hasDiploma) {
			
		    System.out.println("Congratulations");
		    if(gpa>expectedGpa) {
			System.out.println("You are hired");
		    }else {
		 	System.out.println("Unfortunately we cannot hire you");
		}
		}else {
			System.out.println("Please get your degree");
		}
	}
	
	

}
