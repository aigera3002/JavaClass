package com.class4;

public class classTask5 {
	
	//Create a java  program and store variables to store mortgage rate and mortgage price
	//First program should check if rate is higher than 4.5 user will not buy a house, otherwise 
	//user will consider buying
	//Once user decides to buy a house, if price is larger than 200000, than user will take a loan
	// otherwise user will pay cash
	
	
	
	
	public static void main(String[] args) {
		
		double morgagePrice=200000;
		double morgageRate=4.5
				;
		
		if (morgageRate>4.5)  {
			System.out.println("User will not buy the house");
		}else {
			System.out.println("User will consider");
			
			if(morgagePrice>200000) {
			 System.out.println("User will take loan");
			}else {
				System.out.println("User will pay cash");
			 
		 }
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
