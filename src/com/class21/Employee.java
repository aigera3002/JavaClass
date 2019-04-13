package com.class21;

public class Employee {
//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair”
//Create two objects of the class Employee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects
	
	String eID;
	int salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		
	Employee obj=new Employee();
	
	obj.eID="L12342";
	obj.salary=3000;

	
    Employee obj1=new Employee();
	
	obj1.eID="P2341";
	obj1.salary=4000;

	
	System.out.println(obj.eID +" makes "+obj.salary +" and CEO is "+CEO);
	System.out.println(obj.eID +" makes "+obj1.salary +" and CEO is "+CEO);
		
	}
}
