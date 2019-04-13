package com.class21;

public class TestAccessModifiers {
	public static void main(String[] args) {
		
	TestAccessModifiers obj=new TestAccessModifiers();
	obj.isPalindrome("Hello"); //accessing public method in different package
	System.out.println(obj.name3);////accessing public variable in different packag
}
}

