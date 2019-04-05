package com.class16;

public class car {
		
  String make, model, color;
  int doors,wheels;
		
  public static void main(String[] args) {
	 
	  //ClassName variableName=new ClasName();
	  //first object
	  car car1=new car();
	  car1.make="Honda";
	  car1.model="Civic";
	  car1.color="Black";
	  car1.doors=4;
	  car1.wheels=4;
	  
	  //Car honda has 4 wheels 
	  System.out.println("Car "+car1.make+" has " +car1.wheels+ " weels");
      //define behavior
	  car1.drive();
	  car1.reverse();
	  car1.stop();
	 System.out.println("---------Second object------");
	  
	  //2d object
	  car car2=new car();
	  car2.make="Tesla";
	  car2.model="X";
	  car2.color="Red";
	  car2.doors=4;
	  car2.wheels=4;
	  //Make car is blue  Tesla 
	  System.out.println("My car is "+car2.color+" "+car2.make);	
	  car1.drive();
	  car1.reverse();
	  car1.stop();
  }
  
  void drive() {
	  System.out.println("Car can drive");
  }
  void reverse() {
      System.out.println("Car can revesre");
  }
  void stop() {
      System.out.println("Car can stop");
  }
}


