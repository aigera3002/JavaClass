package HomeWorks;

import java.util.Scanner;

public class class9Task6 {
	public static void main(String [] args)  {
		//ask user to input a leap year. Give the user 10 chances to enter 
		//if year divisible by 400-->leap year
	    //if year divisible by 100-->leap year	
	    //if year divisible by 4-->leap year
		//(year%400==0) || ((year%4==0) && (year%100!=0) -->same thing
			
		
	int year;
	
	Scanner scan=new Scanner (System.in);
	
	for (int i=0; i<10; i++) {
			
		System.out.println("Please enter a guessed leap year");
		year=scan.nextInt();
	
		if (year%400==0) {
			System.out.println("Year is leap year");
			break;
		}else if (year%4==0 && year%100!=0) {
			System.out.println("Year is a leap year");
			break;
		}else {
			System.out.println("Year is not a leap year");
		   }
		}
	}
}
