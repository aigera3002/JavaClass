package com.class12;

public class StringManipulations2 {
	public static void main(String [] args)  {
	
	//contains()-->	checks for specific value in the string 
	//if value	
	String str="Good morning, students!";
	boolean contains=str.contains("student");//Student->false(Upper case)
	System.out.println(contains);
		
	String present="Welcome, Assel";// or String neddedValue="Welcome";
	
	
	boolean flag=present.contains("Welcome,");//or boolean flag=present.contains(nededValue);
	System.out.println(flag);
			
	////////////
	//startsWith(), endsWith(), -->will return true if String starts/ends  with
	//else-->false
	
	String str1="syntax";
	boolean starts=str1.startsWith("s");
	System.out.println(starts);
	System.out.println(str1.endsWith("X"));
	////////////////
    //isEmpty() if length of a String is =0-->string is empty else--> it is ...
	String str2="";
	boolean isEmpty=str2.isEmpty();
	System.out.println(isEmpty);
	
	//////////////
	//concat()-> will concatenate one string to the end of another
	String str3="Hello ";
	String str4="Ali!";
	
	System.out.println(str3+str4);
	System.out.println(str3.concat(str4));
	
	////////////////////////////
	//trim()-> will remove spaces at the beginning and the end of the String
	String expected="You may qualify for a multy-policy discount!";
	String actual="You may qualify for a multy-policy discount! ";
	
	actual=actual.trim();
	System.out.println(expected.equals(actual));
	
	}

}
