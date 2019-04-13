package com.HomeWorks;

public class task61 {
	public static void main(String [] args)  {
//2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int[] num = { 4, 760 ,678, 34, 203 };

		    int max = num[0];
		    int min = num[0];
		    int secMax = num[0];
		    for (int a1 = 0; a1 < num.length; a1++) {
		        if (num[a1] > max) {
		            secMax = max;
		            max = num[a1];
		        } else if (num[a1] > secMax) {
		            secMax = num[a1];
		        } else if (num[a1] < min) {
		            min = num[a1];
		        }
		    }
		    System.out.println("The largest number is " + max);
		    System.out.println("The smallest number is " + min);
		    System.out.println("The second largest is "+ secMax);
				
	}
 }
