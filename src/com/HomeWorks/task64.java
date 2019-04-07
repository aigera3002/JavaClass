package HomeWorks;

public class task64 {
	public static void main(String[] args) {
	//Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.
	//For example, the if we run rowSums for the following 2D array:
	//{1,1,2}, //sum = 4
	//{3,1,2}, //sum = 6
	// {3,5,3}, //sum = 11
	 //{0,1,2}  //sum = 3
     //Then we should get the following array back:
	 //4
	 //6
	 //11
	 //3
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			 int rowSum=0;
	        for(int i=0; i<a.length; i++){
	        for(int j=0; j<a[i].length; j++){
	                rowSum+=a[i][j];
	          }
	          System.out.println(rowSum);
	          rowSum=0;
}}}