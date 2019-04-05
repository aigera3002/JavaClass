package com.class17;

public class NoMainMethod {
//methods and variables are member of the class
	
	String str;//data members
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Friends");         // all of this(syso) block of codes
		System.out.println("Hello Friends");
		System.out.println("Friends Hello");

		
	}
	
	void bye() {
		System.out.println("Bye");
	}

	//without main method we cant execute the code
	
	public static void main(String[] args) {//method signature
	
		NoMainMethod obj=new NoMainMethod();//method body
		
		obj.hello();//we calling a method hello

		obj.bye();//we calling a method bye
		
		obj.howAreYou();
	}
	void howAreYou() {
		System.out.println("How are you?");
	}
}
