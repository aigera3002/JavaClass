package com.class11;

public class task1 {
	public static void main(String [] args)  {
		
     String[] names=new String[6] ;
		
		names[0]="BMW";
		names[1]="Mazda";
		names[2]="Mazarati";
		names[3]="Toyota";
		names[4]="Hundai";
		names[5]="AUDI";
		
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names [i]);
		}
     String[] Cars= {"BMW", "Mazda","Mazerati", "Toyota", "Hundai", "AUDI"};
		
		for (int i=0; i<=Cars.length-1; i++) {
			System.out.println(Cars[i]);
		}
		////////////////////////////////////////////
		
    String[] contries= {"USA","Kazakhstan","Armenia","Russia","Ukrain"};

    for (int i=0; i<names.length; i++) {
    	if (contries [i].equals("USA")) {
    		System.out.println("Washington");
        if (contries [i].equals("Kazakhstan")) {
        	System.out.println("Astana");
        if (contries [i].equals("Armenia")) { 
            System.out.println("Baku");
        if (contries [i].equals("Russia")) { 
        	System.out.println("Moscow");
        if (contries [i].equals("Ukrain"))  {
    	    System.out.println("Kiev");
                
        
        String[] countries= {"USA","Kazakhstan","Armenia","Russia","Ukrain"};
        for (String contry: contries) {
        
        switch (contry) {
        case "USA":
        	System.out.println("Washington");
        	break;
     
        case "Kazakhstan":
             System.out.println("Astana");
             break;
     
        case "Armeinia":
             System.out.println("Baku");
             break; 
       
        case "Russia":
            System.out.println("Moscow");
            break;    
   
        case "Ukrain":
             System.out.println("Kiev");
            break;
            
        }
            
        }
        }
        }
        }
        }
        }
    	}     
        }
	}
        
        
     
            
 
      