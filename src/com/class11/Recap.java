package com.class11;

public class Recap {
	public static void main(String [] args)  {
//1.lets create an array of names that will hold 5 elements and retrieve all  values
//create an array using new keyword
		
		String[] names=new String[7];
		
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Wegas";
		names[4]="Dmitry";
		names[5]="Shiva";
		names[6]="Sandesh";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names [i]);
		}
		
		//2. create an array using array Literal
		
		String[] StudentsNames= {"Shaban", "Bilal","Mehmet", "Zaki", "Sumair", "Frank"};
		
		for (int i=0; i<=StudentsNames.length-1; i++) {
			System.out.println(StudentsNames[i]);
		}
		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		
		for (String student:StudentsNames) {
			System.out.println(student);
		}
			
	}

}
