package com.class14;

public class taskForTheGroup {
	public static void main(String[] args) {
		
//1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?

int a=10;
int b=20;
System.out.println("Before swapping");
System.out.println("Value of a is: "+a);
System.out.println("Value of b is: "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping");
System.out.println("Value of a is: "+a);
System.out.println("Value of b is: "+b);

//Swap  2 strings without a temporary variable?

String c="Aigera";
String d="Aliya";

System.out.println("String c is "+c+ " and String d is "+d);

c=c+d;

d = c.substring(0,c.length()-d.length());
c = c.substring(d.length());

System.out.println("String c is now "+c+" and String d is now "+d);
		
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
		
//3. Find out how many alpha characters present in a string?
		
		String str1="12Hello 3234 Aigera465%^%";	
		String newString=str1.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString.length());
		
		
//4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		
		String four="How to find out the part of the string from a string";
		//a.How to find out the part of the string from a string?
	    String needed ="substring";
	    System.out.println(four.contains(needed));
			    
		//b. What is substring?
	    // Substring it’s a String of a String
		//    
		//c. Find number of words in string?
	    String newstr1=four.replaceAll("[A-Za-z]","");
		System.out.println(newstr1.length());
		String[] words=four.split(" ");
		System.out.println(words.length);
		
//5. Write a java program to reverse String? 	
		 String original="Today we are doing Group Task";
	        String reverse="";	
	        for(int i=original.length()-1; i>=0; i--) {
	            reverse=reverse+original.charAt(i);
	        }
	        System.out.println(reverse);
	       
	//Reverse a string word by word?
	        
	   String str="Today we are doing Group Task";

	   int strLeng = str.length()-1;

	   String reverse1="", temp = "";

	     for(int i = 0; i <= strLeng; i++){
	     temp += str.charAt(i);
	      if((str.charAt(i) == ' ') || (i == strLeng)){
	      for(int j = temp.length()-1; j >= 0; j--){
	      reverse += temp.charAt(j);
	      if((j == 0) && (i != strLeng))
	      reverse += " ";
	        }
	       temp = "";
	   
//6. Write a Java Program to find whether a String is palindrome or not?
	      
	    System.out.println("-----Palindrome--------");
	    String str11 = "nurses run";
	    String hey = str11.replace(" ", "");
	    	System.out.println(hey);
	    String rev1 = "";
	    for (int q = hey.length(); q > 0; q--) {
	    	rev1 = rev1 + hey.substring(q - 1, q);
	   			}
	        System.out.println(rev1);
	    if (hey.equals(rev1)) {
	    	System.out.println("This is a palindrome");
	    	} else {
	    	System.out.println("It isn't a palindrome");
	    			}

//7. Write a java program to check whether a given number is prime or not?
	    String primeN = "";

		for (int l = 1; l <= 100; i++) {
			int count = 0;
			for (int j = l; j >= 1; j--) {
				if (l % j == 0) {
					count = count + 1;
				}

			}
			if (count == 2) {
				System.out.print(l + ", ");

			}
		}
		System.out.println();
	    
	       
	       
//8. Write a Java Program to print first 10 numbers of Fibonacci series.
		
		System.out.println("------Fibonacci--------");

		int maxNumber = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

		for (int k = 1; k <= maxNumber; ++k) {
			System.out.print(previousNumber + " ");
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
		       }
	        }
	     }
	}
}
	       
	       
	       
	       
	       
	       
	  
