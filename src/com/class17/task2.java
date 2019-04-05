package com.class17;

public class task2 {
	void result(int a,int b) {
        if(a>b)System.out.println(a+" larger then "+b);
        else System.out.println(b+" larger then "+a);
        
    }
	void palindrome(String text) {
        String reverse="";
        for(int i=text.length()-1;i>=0;i--) {
            reverse=reverse+text.charAt(i);
        }
        if(reverse.equals(text))System.out.println("Palindrom");
        else System.out.println("Not palindrom");
	} 
}