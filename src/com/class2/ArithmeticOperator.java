package com.class2;

public class ArithmeticOperator {
	public static void main(String[] args) {
		//declare 2 int varaibles and then we perform;
		//addition, substruction, multiplication, division
		
		int a=30;
	    int b=15;
	    
	    System.out.println(a+b);  //45
		System.out.println(a-b);  //15
		System.out.println(a*b);   //450
		System.out.println(a/b);  //2
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum);   //45
		System.out.println(sub);   //15
		System.out.println(mult);  //450
		System.out.println(div);       //2
		
		
		//print: the__of 2 numbers is__
		System.out.println("the sum of 2 numbers is " +a+b);
		System.out.println("the sub of 2 numbers is " +(a-b));
		System.out.println("the mult of 2 numbers is " +a*b);
		System.out.println("the div of 2 numbvers is " +a/b);
		
		System.out.println("the sum of 2 numbers is " +sum);
		System.out.println("the sub of 2 numbers is "+sub);
		System.out.println("the mult of 2 numbers is " +mult);
		System.out.println("the divof 2 numvers is " +div);
	}

}
