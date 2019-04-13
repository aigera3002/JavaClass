package com.class20;

public class AccesModifiers {
	public static void main (String[] args ) {
		
		AccesModifiers obj=new AccesModifiers();
	String reversed=obj.reverseString("Hello");
    System.out.println(reversed);
    
	   boolean isPalindrome=obj.isPalindrome("hello");
	System.out.println(isPalindrome);
	
	String[] array=obj.getWordsFromString("Have a good night students!");
	
	for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	for(String word:array) {
		System.out.println(word);
	}
	}
private String[] getWordsFromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
//create a method that will take 1 parameter as a String
//and return reversed String
//Method should be visibility only within same package
	

	protected String reverseString (String str) {
		String reversed="";
		for (int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		return reversed;
 }
	
	//create a method that will take a String and return
	//Whether String is polindrome or not
	//method should be available to all classes within your project
	
	public boolean isPalindrome(String str) {
		boolean flag=false;
		String reversed=reverseString(str);
        if(reversed.equalsIgnoreCase(str)) {
			flag= true;
		}
			return flag;
		}
	}