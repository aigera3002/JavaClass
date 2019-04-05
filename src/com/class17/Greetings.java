package com.class17;

public class Greetings {
	public static void main(String[] args) {
	
		Greetings obj=new Greetings();
		obj.askHowAreYou("Aika");//object (when we calling object its argument)
		 }
	
	//void is a return type, askHowAreYou-method name
	void askHowAreYou(String name)	{//has a parameter String
		System.out.println("How are you "+name);
	}
	void askHowAreYou1(String name)	{
		System.out.println("How are you "+name);// none of them gonna execute without object
	}
	void askHowAreYou2(String name)	{
		System.out.println("How are you "+name);
	}		
}
