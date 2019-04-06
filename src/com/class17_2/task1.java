package com.class17_2;

public class task1 {
	public static void main(String[] args) {
		//I want print pattern
		//54321
		//54321
		//54321
		//54321
		for (int f=5; f<0; f--) {
            for (int g=5; g<0; g--) {
                System.out.println(g);
            }
            System.out.println();
            
            
        //I want print pattern rows
   		//1*
   		//2**
   		//***
   		//****
         for (int a=0; a<4; a++) {
            for (int b=0; b<=a; b++) {
               System.out.println("*");
              }
              System.out.println();
         }
	  } 
	}
 }

