package com.class6;

import java.util.Scanner;

public class homeWorkTask {
	public static void main (String[] args) {
	
        Scanner scan;
		String language;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter wcich country you are from");
		language=scan.nextLine();
		
		switch(language) {
		
		case "USA":
			language="English";
			break;
		case "Afghanistan":
			language="Pashto";
			break;
		case "Russia":
			language="Russia";
			break;	
		case "Kazakhstan":
			language="Kazakh";
			break;
		case "Ukrain":
			language="Ukranian";
			break;
		case "Pakistan":
			language="Urdu";
			break;
		default:
			language="Unknown";
			}
		System.out.println("The language you are speak is "+language);
	     }
	}
