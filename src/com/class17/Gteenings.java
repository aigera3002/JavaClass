package com.class17;

public class Gteenings {
	public static void main(String[] args) {
		
	Gteenings obj =new Gteenings();	
		obj.hello();
		//how to find the largest number
		obj.findLargest(20,30);//calling method FindLargest and passing valus
		obj.findLargest(30,31);
		obj.findLargest(2000,310098);
		obj.helloToInstractor("Wegas");
		obj.helloToInstractor("Arif");
	}
	void hello() {//method signature does not has one parameter
		System.out.println("Hello");//method body
	}
	
	void helloToInstractor(String name) { // method signature  has parameter
		System.out.println("Hello "+name);// method body
	}


	void findLargest(int a, int b) {//method with two parameters
			
			if(a>b) {
				System.out.println("A is larger than B");
				
			}else {
				System.out.println("B is larger than A");
				
			}				
	}
}
