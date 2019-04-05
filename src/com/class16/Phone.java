package com.class16;

public class Phone {

	boolean screen, speaker;//true, false
	String brand;//Apple,Samsung, Blackberry
	int ram;//32
	
	  public static void main(String[] args) {
		  
		  Phone phone1=new Phone();
		  
			phone1.screen=true;
			phone1.speaker=true;
			phone1.ram=32;
		  	phone1.brand="iPhone";
			
		  	phone1.watchVideos();
		  	phone1.makePhoneCalls();
		  	phone1.playMusic();
	
		  	//second object
		  	
		  	Phone phone2=new Phone();
			  
			phone2.screen=false;
			phone2.speaker=false;
			phone2.ram=16;
		  	phone2.brand="Android";
			
		  	phone2.watchVideos();
		  	phone2.makePhoneCalls();
		  	phone2.playMusic();
	 	
		  	//object 3
		  	
			Phone phone3=new Phone();
			  
			phone3.screen=false;
			phone3.speaker=true;
			phone3.ram=12;
		  	phone3.brand="Nokia";
			
		  	phone3.watchVideos();
		  	phone3.makePhoneCalls();
		  	phone3.playMusic();
      }
	  void watchVideos() {
		  System.out.println("We can watch Videos on the Phone "+brand);
	  }
	  void makePhoneCalls() {
	      System.out.println("We can make Phone Calls on our Phone "+brand);
	  }
	  void playMusic() {
	      System.out.println("We can play music on our Phone "+brand);
	  }	
}
