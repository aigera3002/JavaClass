package com.class20;

public class task {
public static void main (String [] args) {

	//create a method createEmail() .
	//based on provideed users name, lastName and emailType,
	//your method should return complete email Adress;
	// johnsnow@gmail.com
	// johnsnow@yahoo.com
	
	task obj=new task();
	String email=obj.createEmail("John", "Snow", "gmail");
	System.out.println(email);
	
	email=obj.createEmail("Bob", "Snow", "outlook");
	System.out.println(email);
}
//return type methodName
String createEmail (String name, String lastName, String emailType) {
	
	String email= name + lastName + "@" + emailType + ".com";
	return email.toLowerCase();

}
}
