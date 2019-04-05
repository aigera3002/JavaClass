package com.class3;

public class TemperatureCheck {
	public static void main(String[] args) {
	 
		double temp=30;
		double temp1=32;
		
		  if(temp1>temp) {
		    	System.out.println("Water will freeze with temperature " +temp);
		    } else {
		    	System.out.println("Water will not freeze with temperature " +temp1);
		    }
		    
		  //vs
		  
		double temp2=30;
		double temp3=32;
			
		 if(temp2<temp3) {
			    System.out.println("Water will not freeze with temperature " +temp2);
			} else {
			    System.out.println("Water will freeze with temperature " +temp3);
			}
		  
		
		
		
		
		
		
	}
}
