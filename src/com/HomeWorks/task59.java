package com.HomeWorks;

import java.util.Scanner;

public class task59 {

	public static void main(String[] args) {
		System.out.println("-----Palindrome--------");
	    String str11 = "nurses run";
	    String hey = str11.replace(" ", "");
	    	System.out.println(hey);
	    String rev1 = "";
	    for (int i = hey.length(); i > 0; i--) {
	    	rev1 = rev1 + hey.substring(i - 1, i);
	   			}
	        System.out.println(rev1);
	    if (hey.equals(rev1)) {
	    	System.out.println("This is a palindrome");
	    	} else {
	    	System.out.println("It isn't a palindrome");
	    			}
	}
}