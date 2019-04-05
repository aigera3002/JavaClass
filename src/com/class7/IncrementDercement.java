package com.class7;

public class IncrementDercement {
	public static void main(String[] args) {
		
		int x=1;
		x=x+1;
		System.out.println(x);
		 
		int y=1;
		 y+=1;
		 System.out.println(y);
		  
		 int z=1;
		 z++;
		 System.out.println(z);
		 
		 int w=2;
		 w++;
		 System.out.println(w);
		 
		 int v=10;
		 v--;
		 System.out.println(v);
		 
		 int a=10;
		 int b=++a; //preincement=first increment--> assign 
		        
		 System.out.println(a);//11
		 System.out.println(b);//11
		 
		 int c=10;
		 int d=c++;//postincrement =first assign--> increment
		 
		 System.out.println(d);//10
		 System.out.println(c);//11
		 
		 int q=100;
		 int e=q--;
		 System.out.println(e);//100
		 System.out.println(q);//99
		 
		 int h=50;
		 int g=--h;
		 System.out.println(g);//49
		 System.out.println(h);//49
		 
	}

}
