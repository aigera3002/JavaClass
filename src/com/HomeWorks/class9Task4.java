package HomeWorks;

public class class9Task4 {
	public static void main(String [] args)  {
	// Print the following pattern:
	//1
	//12
	//123
	//1234
    //12345
		
		for (int i=1; i<=5; i++) {
		  for (int k=1; k<=i; k++) {
		  
		System.out.print(k);
		  }
		System.out.println();
		
	/////////////////////////////////////////////	
		
	// Print the following pattern:
	//		*
	//		**
	//		***
	//		****
	//		***** 5 rows, columns depend on rows
	//		****
	//		***
	//		**
	//		*
		for (int a=1; a<=5; a++) {
			  for (int b=1; b<=a; b++) {
			  
			System.out.print("*");
			  }
			System.out.println();
		}
		for (int a=1; a<=4; a++) {
			for (int b=4; b>=a; b--) {
				System.out.print("*");
			}
			System.out.println();
		 }
		}
	}
}

