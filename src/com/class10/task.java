package com.class10;

public class task {
	public static void main(String [] args)  {
//1.Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B 
		//(use 2 different ways of creating an array).

		
      char [] array= { 'A','B','C','D','E','F'};
	  System.out.println(array[1]);
	
	  
	  char[] grade=new char[6];
	  grade[0]='A';
	  grade[1]='B';
	  grade[2]='C';
	  grade[3]='D';
	  grade[4]='E';
	  grade[5]='F';
	  System.out.println(grade[1]);
	  /////////////////////////////////////
		
	//2.Create an array of names and store all names of your group. Then print your name from that array. 
			//(use 2 different ways of creating an array).	
		
	  String[] name=new String[5];
	  name[0]="David";
	  name[1]="Tatiana";
	  name[2]="Manel";
	  name[3]="Aigera";
	  name[4]="Mehmet";
	  System.out.println(name[3]);
	
	  System.out.println(grade[1]);
	  String[] names= {"David", "Tatiana", "Manel", "Aigera", "Mehmet"};
		
		System.out.println("There are "+names. length+" people in my group");
	    System.out.println(names [3]);
	    
	    //3.Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”.	  	
		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		
		String sentence=words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		
		System.out.println(sentence);
		
	}

}
