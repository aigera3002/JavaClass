package com.class12;

public class StringManipulations {
	public static void main(String [] args)  {
		
		String str="Syntax";
		int lengthofString=str.length();
		System.out.println(lengthofString);
		
		String str1="Syntax Technologies";
		
		int lengthof2String=str1.length();
		System.out.println(lengthof2String);
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		//toUpperCase()->convert all character to UpperCase
		//toLowerCase()->convert all character to LowerCase
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String newLowerString=str3.toLowerCase();
		System.out.println(newLowerString);
		
		//equals()- 2 strings, if strings are equal-->true,  else-->false
		String str4="Hello";
		String str5="hello";
		
		boolean equality=str4.equals(str5);
		System.out.println(equality);
		
		//equalsIgnoreCase()-->compares 2 strings but ignoring the case
		String expectedBrowser="chrome";
		String actualBrowser="CHROME";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
		
		
		
		
		
		
	}
}
