package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	//ask user to enter city and temperature in Farhenhait
	//program should convert F-->C
	//program should say "The temperature in the city__is__"
	
	public static void main(String[] args) {
		
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		
		System.out.println("Please eneter temperature in Fahrenheit" );
		
		temp=myScanner.nextInt();
		//formula (F-32)*5/9
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("the temperature in the city " +cityName+ " is "  +convertedTemp+ "C");
		
		
		
		
	
		
		
		
		
		
	}
	

}
