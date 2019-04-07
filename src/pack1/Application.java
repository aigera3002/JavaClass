package pack1;

public class Application {
	public static void main(String[] args) {
		
		Human person1=new Human();
		
		 person1.eyeColour="pink";
		
		System.out.println(person1.eyeColour);
		System.out.println(person1.heigth);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		

		Human person2=new Human();
		
		person1.eyeColour="orange";
		
		System.out.println(person2.eyeColour);
		System.out.println(person2.heigth);
		System.out.println(person2.weight);
		System.out.println(person2.gender);
		
		
		
	}
}
