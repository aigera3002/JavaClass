package com.pack1;

public class Human {
	static String eyeColour="Brown";  //instant variables
    int heigth=6;
	int weight=180;
	String gender="F";
	
	String programmingLanguage="Java";
	void speak() {
		String language="English"; //local variables
		
	System.out.println("Human can speak "+language);
	
}

void coding() {
	System.out.println("Syntax students can code "+programmingLanguage);
}

public static void main(String[] args) {
	System.out.println("Ho");
}
}
