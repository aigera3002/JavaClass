package com.class9;

public class NesdedLoops {
	public static void main(String[] args) {
		
		for (int i=0; i<=5; i++)  {
			System.out.println(i);
			}
		    System.out.println();
		for (int i=0; i<=5; i++) {
			System.out.println(i);
			}
	        System.out.println();
		for (int i=0; i<=5; i++)  {
			  System.out.println(i);
		    }
		
		//I want to print pattern
		//12345
		//12345
		//12345
		//12345
		
		for (int i=1; i<5; i++) {
			for (int y=1; y<6; y++) {
			System.out.print(y); //12345
		}
		System.out.println();
		
		//I want to print pattern
        //* 123456789 -->rows =5, columns=9
        //* 123456789
        //* 123456789
        //* 123456789
        //* 123456789
       
       for (int a=1; a<=5; a++) {
           
           for (int b=1; b<=9; b++) {
               
               System.out.print(b);//12345
           }
           System.out.println();
       }
		//I want to print pattern
		//1111111 --> rows-7, pattern-7
		//2222222
		//3333333
		//4444444
        //5555555
		//6666666
		//777777
         for (int c=1; c<=7; c++) {
            for (int z=1; z<=7; z++) {
                System.out.print(z);//1111111 //2222222
            }
            System.out.println();
    
            //I want to print pattern
            // *****
            // *****
            // *****
            // *****
          for (int f=0; f<4; f++) {
              for (int g=0; g<5; g++) {
                  System.out.println(g);
             }
             System.out.println();
            }
          }
		}
	}
}
