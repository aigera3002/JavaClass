package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
	public static void main(String[] args) {
	
	//Prompt user to enter their country
	//based on the country -->specify favorite food
		
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter wcich country you are from");
		country=scan.nextLine();
		
		switch(country) {
		
		case "USA":
			favoriteFood="Burger";
			break;
		case "Afghanistan":
			favoriteFood="Palau";
			break;
		case "Russia":
			favoriteFood="Pelmeni";
			break;
		case "Italy":
			favoriteFood="Pasta";
			break;
		case "Turkey":
			favoriteFood="Bakhlava";
			break;
		case "Morocco":
			favoriteFood="Couscous";
			break;
		case "Kazakhstan":
			favoriteFood="Beshbarmak";
			break;
		case "Pakistan":
			favoriteFood="Biriyani";
			break;
		default:
			favoriteFood="Unknown";
			}
		System.out.println("You favorite food is "+favoriteFood);
	}

}
