package com.class12;

public class task {
	public static void main(String [] args)  {
	
			//Create a grocery list: fruits{}
			// *                         veggies{}
	        // *                         dairy{}
    	    // * Retrive all values using 2 different loops
		

		String[][] groceryList= {
	            {" apples"," oranges"," bananas"," kiwies"},
	            {" carrots","t omatos"," cucumbes"," beets"},
	            {" milk"," cheese"," yogurt"},
	            };
		for (String[] list:groceryList) {
			for (String item:list) {
				System.out.print(item);
			}
			System.out.println();
		}
	}

}
