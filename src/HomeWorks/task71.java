package HomeWorks;

public class task71 {
	public static void main(String[] args) {
	
		String str="laptops out of harambe";	
		
		String[] array=str.split("lapt");
        for(String substring: array) {
            System.out.println(substring);	
		}
        String str1="laptops out of harambe";	
        String[] array1=str1.split("laptop t of harambe");
        for(String substring: array1) {
            System.out.println(substring);
        
        } 
	}
}
