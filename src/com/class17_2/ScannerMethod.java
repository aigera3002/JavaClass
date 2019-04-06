package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
	
		ScannerMethod obj =new ScannerMethod();
		Scanner scan =new Scanner(System.in);
		
	int a=scan.nextInt();
	int b=scan.nextInt();
	obj.sum(a,b)	;

	
	    obj.sum(12,13);
		obj.sum(100,100);
		
		obj.sub();
		obj.sub();
	    } 

		protected void sum(int x, int y) {
			System.out.println(x +y);
			
		}
	
		void sub() {
			int a=10, b=12;
			System.out.println(a +b);
		}
}
