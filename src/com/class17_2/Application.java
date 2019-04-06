package com.class17_2;

import com.class17.calculator;

public class Application {
	
	public static void main(String[] args) {
		
		ScannerMethod scnMthd=new ScannerMethod();
		
		calculator obj=new calculator();
	
	
	int d=obj.sum(23,67); 
	System.out.println(d);

	

	int c=obj.sub();
	System.out.println(c);
	

	int p=obj.div(45, 609);
	System.out.println(p);
	
	int y=obj.div(478, 600);
	System.out.println(y);
	
	
	
	}
	
}
