package HomeWorks;

public class sample {
	public static void main(String[] args) {
		int[][] a = {
			{5,2,3,8},
			{1,5,1,1},
			{7,3,1,2}
		};
		int max=a [0][0];
		for (int i=0; i<2; i++) {
		for (int j=0; j<4; j++) {
			if (a[i][j]>max) {
				max=a[i][j];
			}
		 }
		}
System.out.println(max);

	}				
}
