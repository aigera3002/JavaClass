package com.class7;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		//ask user to pay for a soda
		//keep asking user to pay for the soda until entered price is not equal to 1.99
		//after using got right amount print "Please enjoy your soda"
		
		Scanner scan;
		scan=new Scanner(System.in);
	
		double price;
		
			do { 
		    System.out.println("Please enter the price: ");
			price=scan.nextDouble();
			} while (price!=1.99);
			System.out.println("Please enjoy your soda!");
				
		}
	}


