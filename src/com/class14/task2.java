package com.class14;

public class task2 {
	public static void main(String[] args) {

//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		String str="I am a good tester!";
		String newStr=str.replace(" ", "");
		System.out.println(newStr);
		
//Create a String that should be combination of letters, numbers and special characters. 
//Find out how many alpha characters are there in the String.

		String str1="12Hello 3234 Aigera465%^%";	
		String newString=str1.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString.length());
		
//You have a String a=“Is it Saturday! Is it raining! Do we have a Java Class today?” 
//How would you find out how many sentences are in that String?	
		
		String a="“Is it Saturday! Is it raining! Do we have a Java Class today?";	
		String [] array= a.split("//?");
        System.out.println("The number of sentences in string is: "+array.length);
	}
}
