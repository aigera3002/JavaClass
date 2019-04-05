package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
	//1 replace()
		
	String str="I am a good tester#1!";
	String newStr=str.replace("a", "e");
	System.out.println(newStr);
		
	String newStr1=str.replace("good", "great");
	System.out.println(newStr1);
		//ehat are we looking for to replace, new value

	String newStr2=str.replace("tester", "programmer");
	System.out.println(newStr2);
		

	String newStr3=str.replace("Tester", "programmer");
	System.out.println(newStr3);
		
	String newStr4=str.replace("!", "?");
	System.out.println(newStr4);
		
	String newStr5=str.replace("1", "2");
	System.out.println(newStr5);
	
//2 replaceAll() - will replace all that matches specified pattern[regex];
		
	String str1="12Hello 3234 World 465%^%";
	String replacedNoNumbers=str1.replaceAll("[0-9]", "");
	System.out.println(replacedNoNumbers);
				
	String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
	System.out.println(newString);
				
//String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//System.out.println(replacedNoCharacter);
				
	String str2="1Hello123";
	System.out.println(str2.replaceAll("[^0-9]", ""));
	}
}
