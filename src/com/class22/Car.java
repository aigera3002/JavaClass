package com.class22;

public class Car {

	//Car obj=new Car();
	//Car-CLASS NAME
	//obj-REFERENCE VARIABLES/OBJECT NAME
	//= - ASIGNING OPERATOR
	//new -KEYWORD THAT CREATES AN OBJECT
	//Car()-CONSTRUCTOR(lives outside the method)
	
	//Constructor will initialize Object and it will give default values
	public static String make="Toyota";
    String color;//declaring instance variable
    String model;
    int doors;
    boolean engine;
    
//    Car() {//constructor
//    System.out.println(“I am a constructor”);
//    System.out.println(“Hello from constructor”);
//    }
    
    public static void main(String[] args) {
        
        Car obj = new Car();
        System.out.println(obj.color);
        System.out.println(obj.doors);
        System.out.println(obj.engine);
        //hello();
    }
}
