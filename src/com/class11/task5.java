package com.class11;

public class task5 {
	public static void main(String [] args)  {
		//create an array of cars; american cars,  german cars, korean cars, italian cars; 
		//Then retrieve all values from that array
		
		String[][] cars= {
				{" chevrolet", " ford", " honda", " jeep"},
				{" audi", " BMW", " Porsche"},
				{" hyundai", " Kia", " Daewoo", " PMC"},
				{" Ferrari", " Lamborghini", " Fiat", " Alfa Romeo"}
		};
			
		for (int i=0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i] [j]);
			}
			System.out.println();
		}
		String[][] country= {
				{" Cuba", " Belize", " Jamaica"},
				{" Colombia", " Ecuador", " Bolivia", " Argentina"},
				{" France", " Italy", " Austria", " Demnark"},
				{" Korea", " Kazakhstan", " Indonesia", " China"}
			
		};
			
		for (int i=0; i<country.length; i++) {
			for (int j=0; j<country[i].length; j++) {
				System.out.print(country [i] [j]);
			}
			System.out.println();
		
		}	
	}

}
