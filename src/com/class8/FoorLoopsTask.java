package com.class8;

public class FoorLoopsTask {
	public static void main(String[] args) {
		
		//print numbers from 1 to 100
		for (int i=1 ; i<=100 ;      i++  ) {
			System.out.println(i);
		      }
		//print numbers from 100 to 1
		for (int i=100 ; i<=1 ;      i++  ) {
			System.out.println(i);
		      }
		//print odd numbers from 1 to 20 (2 ways)
		
		for (int i=1 ;   i<=20 ;    i+=2  ) {
			System.out.println(i);
		      }
		//print even numbers from 20 to 1 (2 ways)
		
				for (int i=20 ;   i>=2 ;    i-=2  ) {
					System.out.println(i);
				      }
		//print even numbers from 20 to 50 (2 ways)		
				for (int i=20 ;   i<=50 ;    i+=2  ) {
					System.out.println(i);
				      }
	         for (int i=20; i<=50; i++) {
		     if(i%2==0) {
			   System.out.println(i);
		   }
	  
			//print odd numbers from 20 to 50 (2 ways)		
				for (int a=20 ;   a<=50 ;    a++  ) {
					System.out.println(i);
				      }
		
				 for (int a=20; a<=50; a++) {
				     if(a%2==1) {
					   System.out.println(i);
				   }
				 }
		 }
	}
}
