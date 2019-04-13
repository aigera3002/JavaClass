package com.class22;

public class ConstructroTypes {
	
	//ConstructroTypes(){
	//	System.out.println("I am a constructror with no parameters");		
	//}
	
	ConstructroTypes(String str) {//str - is a local variable to constructor
		System.out.println("I am a constructror with one parameters "+str);
	}
	
	ConstructroTypes(int a, String str){
		System.out.println("I am a constructror with two parameters "+a+" and "+str);
	}
	
	 public static void main(String[] args) {
		 
		 ConstructroTypes obj1=new ConstructroTypes("String1");	
	
		 ConstructroTypes obj=new ConstructroTypes("String");	 
		 
		 ConstructroTypes obj3=new ConstructroTypes(123, "String");	
	 
	 }
}
