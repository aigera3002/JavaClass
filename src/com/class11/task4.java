package com.class11;

public class task4 {
	public static void main(String [] args)  {
		
		String[][] firstLastName= {
	            {"Mr","Mrs","Ms","Miss"},
	            {"Smith","Jordan","Jackson","Obama"},
	            };
	    
	    System.out.println(firstLastName[0][1]+" "+firstLastName[1][0]);
	    System.out.println(firstLastName[0][0]+" "+firstLastName[1][3]);
	    System.out.println(firstLastName[0][2]+" "+firstLastName[1][2]);
	    System.out.println(firstLastName[0][3]+" "+firstLastName[1][1]);
	////////////////////////
	    
	    String[][] namesGrades= {
	            {"Misha","Lesha","Vanya","Kolya"},
	            {"A","B","C","D"},
	            };
	    System.out.println(namesGrades[0][0]+" has "+namesGrades[1][0]+ " grade");
	    System.out.println(namesGrades[0][1]+" has "+namesGrades[1][1]+ " grade");
	    System.out.println(namesGrades[0][2]+" has "+namesGrades[1][2]+ " grade");
	    System.out.println(namesGrades[0][3]+" has "+namesGrades[1][3]+ " grade");
		
		
	}
}
