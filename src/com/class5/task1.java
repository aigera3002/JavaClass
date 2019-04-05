package com.class5;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		//Prompt the user to enter two people's heights in inches. Each person should be classified as one of the following:
	    int heights;
		Scanner scan = new Scanner (System.in);
		System.out.println("Pleaser enter your heights in inches");
		heights= scan.nextInt();
		
		if(heights<5) {
			System.out.println("you are short");
		
		}else if(heights== 5 ||  heights<6) {
			System.out.println("you are medium");
			
		}else if(heights>= 6) {
			System.out.println("you are tall");
			
		}else {  
			System.out.println("you are valid");
		
		}
			
	}
	
}
