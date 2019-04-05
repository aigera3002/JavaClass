package com.class7;

public class OddNumbers {
	public static void main(String[] args) {
		//print only odd numbers from 1 to 20*/
		
		int num=1;
		while (num<=20) {
			System.out.println("I am inside while loop");
		
		  if (num%2!=0) {
			  System.out.println(num);
			   }
		  num++;
		}
////////////////////////

      ////print only even numbers from 10 to 100*/
		
		int num1=10;
		while (num1<=100) {
			System.out.println("I am inside while loop");
		
		  if (num1%2==0) {
			  System.out.println(num1);
			   }
		  num1++;
		  }
		
		//create a boolean variable workDay and assign true
		//create int variable day and assign it to 1
		//as long as it is workDay print-->"I need off" and increment day
		//day once day is 6 --> your condition for your loop should become false */
		
		
		boolean workDay=true;
		int day=1;
		
		while (workDay)  {
			
			if (day==6) {
		System.out.println("I do not need day off");
				workDay=false;	
			}else {	
				System.out.println("I need a day off");
			}
			day++;	 
		 }
	}	
	}		