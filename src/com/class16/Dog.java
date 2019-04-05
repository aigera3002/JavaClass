package com.class16;

public class Dog {

	boolean longHair;//true, false
	String breed, color, name;//husky, buldog,labrador
	int height;//
	
	  public static void main(String[] args) {
		  
		  Dog puppy1=new Dog();
		  

			puppy1.longHair=false;
			puppy1.breed="Husky";
			puppy1.color="white";
		  	puppy1.name="Casper";
		  	puppy1.height=22;
			
		  	puppy1.walk();
		  	puppy1.sleep();
		  	puppy1.play();  
		  	
		  	//second object
		  
		  	Dog puppy2=new Dog();
			  

			puppy2.longHair=false;
			puppy2.breed="Buldog";
			puppy2.color="brown";
		  	puppy2.name="Potato";
		  	puppy2.height=18;
			
		  	puppy2.walk();
		  	puppy2.sleep();
		  	puppy2.play(); 
		  
		  //second object
			  
		  	Dog puppy3=new Dog();
			  

			puppy3.longHair=false;
			puppy3.breed="Labrador";
			puppy3.color="beige";
		  	puppy3.name="Jacky";
		  	puppy3.height=24;
			
		  	puppy3.walk();
		  	puppy3.sleep();
		  	puppy3.play();
		
	  }
	  void walk() {
		  System.out.println("We can walk with a puppy "+name);
	  }
	  void sleep() {
	      System.out.println("We can sleep with a puppy "+name);
	  }
	  void play() {
	      System.out.println("We can play with a puppy "+name); 
		  
	  }
}
